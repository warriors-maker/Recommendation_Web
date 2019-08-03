package cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {
protected JedisPool jedisPool = null;
	
	public Redis() {
		try {
			//TODO: Need to do Better Config in the future.
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxTotal(RedisUtil.MAX_ACTIVE);
			
			jedisPool = new JedisPool(config,RedisUtil.HOSTNAME,RedisUtil.PORT);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Jedis getJedis() {
		Jedis jedis = jedisPool.getResource();
		return jedis;
	}
	
	public void closeJedis(Jedis jedis) {
		jedis.close();
	}
}