package cache;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface RedisConnection {
	
	public void invalLikedCache(String userId);
	
	public void setFavoriteItems(String userId, List<Item> items);
	
	public Set<Item> getFavoriteItems(String userId);

	
}
