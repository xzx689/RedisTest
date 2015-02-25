package ihandy.redis.test;

import ihandy.redis.data.TestData;
import ihandy.redis.util.RedisPool;

import java.nio.ByteBuffer;

import redis.clients.jedis.Jedis;

public class BufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RedisPool pool = new RedisPool();
		Jedis jedis = pool.getConnection();
		
	
		long startTime =System.currentTimeMillis();

		
		//for (int i = 0; i < 10000; i++) {
			TestData testData = new TestData();
			TestData testData11 = new TestData();
			/*jedis.set((11111+"dd").getBytes(), testData.toBuffer().array());
			byte[] value = jedis.get((11111+"dd").getBytes());
			ByteBuffer b = ByteBuffer.wrap(value);
			testData.fromBuffer(b);
			System.out.println(testData.getStr0());*/
			//jedis.set(("sss").getBytes(), testData.toBuffer().array());
			//testData11 = testData.fromBuffer(ByteBuffer.wrap(jedis.get("sss".getBytes())));
			
			//System.out.println(testData11.getStr0());
			
			
		//}
			
			for (int i = 0; i < 100000; i++) {
				
				testData11 = testData.fromBuffer(ByteBuffer.wrap(jedis.get((i+"s").getBytes())));
				//System.out.println(testData11.getStr0());
			}
			
		System.out.println("HashÖ´ÐÐºÄÊ±"+(System.currentTimeMillis()-startTime));
		
		
	}

}
