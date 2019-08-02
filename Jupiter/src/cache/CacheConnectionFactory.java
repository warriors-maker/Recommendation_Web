package cache;

import db.DBConnection;
import db.MySQLConnection;

public class CacheConnectionFactory {
	private static final String DEFAULT_CACHE = "singleServer";
	
	public static RedisConnection getConnection(String cache) {
		switch (cache) {
		case "singleServer":
			return new SingleRedisPool();
		default:
			throw new IllegalArgumentException("Invalid db:" + cache);
		}

	}

	public static RedisConnection getConnection() {
		return getConnection(DEFAULT_CACHE);
	}

}
