package ihandy.redis.test;

import ihandy.redis.data.TestData;
import ihandy.redis.util.RedisPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import redis.clients.jedis.Jedis;

public class ExecutorBufferTestSet {
	private ExecutorService exec;
	private int cpuCoreNumber;
	private List<Future<Long>> tasks = new ArrayList<Future<Long>>();
	static long startTime ;
	// 内部类
	class SumCalculator implements Callable<Long> {
		private int start;
		private int end;

		public SumCalculator( int start, int end) {
			this.start = start;
			this.end = end;
		}

		public Long call() throws Exception {
			Long count=testBuffer(this.start,this.end);
			System.out.println("线程结束运行时间"+(System.currentTimeMillis()-startTime));  
			return  count;
		}
	}

	public ExecutorBufferTestSet() {
		//cpuCoreNumber = Runtime.getRuntime().availableProcessors();
		
		//设置线程数
		cpuCoreNumber=4;
		exec = Executors.newFixedThreadPool(cpuCoreNumber);
	}

	public Long testBuffer(int start,int end) {
		RedisPool pool = new RedisPool();
		Jedis jedis = pool.getConnection();
		long startTime =System.currentTimeMillis();
		for (int i = start; i < end; i++) {
			TestData testData = new TestData();
			//jedis.set(Integer.toString(i).getBytes(), testData.toBuffer().array());
			jedis.set((i+"s").getBytes(), testData.toBuffer().array());
		}
		return (System.currentTimeMillis()-startTime);
	}

	public void sum(int count) {
		// 根据CPU核心个数拆分任务，创建FutureTask并提交到Executor
		
		for (int i = 0; i < cpuCoreNumber; i++) {
			int increment = count / cpuCoreNumber + 1;
			int start = increment * i;
			int end = increment * i + increment;
			if (end > count)
				end = count;
			SumCalculator countbCalc = new SumCalculator(start, end);
			FutureTask<Long> task = new FutureTask<Long>(countbCalc);
			tasks.add(task);
			if (!exec.isShutdown()) {
				exec.submit(task);
			}
		}
		
	}
	public void close() {	
		exec.shutdown();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		startTime =System.currentTimeMillis();
		System.out.println("进程启动时间"+startTime);  
		ExecutorBufferTestSet calc = new ExecutorBufferTestSet();  
		//设置测试数据的数量
		int count=100000;
		calc.sum(count);  
	
		//calc.close();  
		
	
		
		
	}
}
