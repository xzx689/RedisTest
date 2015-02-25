package ihandy.redis.test;

import java.util.List;

import ihandy.redis.data.TestData;
import ihandy.redis.util.RedisPool;
import redis.clients.jedis.Jedis;

public class HashTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RedisPool pool = new RedisPool();
		Jedis jedis = pool.getConnection();
		
	
		long startTime =System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			
			jedis.hmget(i+"", "str9");
			//System.out.println(jedis.hget(i+"", "str8"));
		}
		
		
		/*for (int i = 0; i < 100000; i++) {
			TestData testData = new TestData();
			jedis.hmset(i + "", testData.getMap());
			jedis.hmget(i+"", "str9");
			//System.out.println(jedis.hget(i+"", "str8"));
		}
		*/
		/*List<String> list = jedis.hmget("1","str0","str1","str3");
		
		for(String l:list){
			System.out.println(l);
		}*/
	//System.out.println(jedis.hmget("1","str0","str1"));
		
		System.out.println("HashÖ´ÐÐºÄÊ±"+(System.currentTimeMillis()-startTime));
		
		
	}

}
