package cache;

import java.util.Set;

import entity.BytesObjectItem;
import entity.Item;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
/*
 * This is just a single instance of Redis
 */
public class SingleRedisConnection extends Redis implements CacheConnection{
	
	private JedisPool jedisPool = null;
	
	public SingleRedisConnection() {
		super();
	}
	
	@Override
	public void invalidFavoriteCache(String userId) {
		// TODO Auto-generated method stub
		Jedis jedis = this.getJedis();
		jedis.del(userId.getBytes());
		this.closeJedis(jedis);
	}

	@Override
	public void setFavoriteCache(String userId, Set<Item> items) {
		Jedis jedis = this.getJedis();
		byte[] bytes = BytesObjectItem.serizlize(items);
		jedis.set(userId.getBytes(),bytes);
		this.closeJedis(jedis);
	}

	@Override
	public Set<Item> getFavoriteCache(String userId) {
		Jedis jedis = this.getJedis();
		byte[] bytes = jedis.get(userId.getBytes());
		Set<Item> items = (Set<Item>)BytesObjectItem.deserialize(bytes);
		this.closeJedis(jedis);
		return items;
	}

}
