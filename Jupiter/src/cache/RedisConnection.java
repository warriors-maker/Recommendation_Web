package cache;

import java.util.List;
import java.util.Set;

import entity.Item;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public interface RedisConnection {
	
	public void invalLikedCache(String userId);
	
	public void setFavoriteItems(String userId, List<Item> items);
	
	public Set<Item> getFavoriteItems(String userId);

	
}
