package cache;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface CacheConnection {
	
	public void invalidFavoriteCache(String userId);
	
	public void setFavoriteCache(String userId, Set<Item> items);
	
	public Set<Item> getFavoriteCache(String userId);
	
	public void mockInsert();
	
	public void mockQuery();
	
	public void mockDel();
}
