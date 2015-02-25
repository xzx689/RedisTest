package ihandy.redis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPool {
    private JedisPoolConfig config;
    private JedisPool pool;
	private static Jedis jedis;
    public RedisPool(){
        config = new JedisPoolConfig();
      
       /* config.setMaxTotal(300);
        config.setMaxIdle(5);
        config.setMinIdle(0);
        */
        config.setMaxTotal(1000);
        config.setMaxIdle(10);
        config.setMinIdle(0);
        
        config.setMaxWaitMillis(10000);
        config.setMinEvictableIdleTimeMillis(300000);
        config.setSoftMinEvictableIdleTimeMillis(-1);
        config.setNumTestsPerEvictionRun(3);
        config.setTestOnBorrow(false);
        config.setTestOnReturn(false);
        config.setTestWhileIdle(false);
        config.setTimeBetweenEvictionRunsMillis(60000);//一分钟
         pool = new JedisPool(config,"192.168.4.109",6379,10000);
        
         //pool = new JedisPool(config,"127.0.0.1",6379,10000);
    }
     
    public Jedis getConnection(){
        Jedis jedis = pool.getResource();//从pool中获取资源
        return jedis;
    }
     
    public void returnResource(Jedis jedis){
        pool.returnResource(jedis);
    }
     
    public void destory(){
        pool.destroy();
    }
     
    public static void main(String[] args) throws InterruptedException {
        RedisPool pool = new RedisPool();
        for(int i= 0;i<100;i++){
            Jedis jedis = pool.getConnection();
            System.out.println(jedis.get("name"));
            pool.returnResource(jedis);
        }
        Thread.currentThread().sleep(1000 * 100);
        
        
     /*   jedis = new Jedis("127.0.0.1",6379);
        jedis.set("name", "xu");
        System.out.println(jedis.get("name"));*/
        
        
        
    }
}
