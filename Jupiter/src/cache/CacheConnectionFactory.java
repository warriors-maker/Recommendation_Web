package cache;

import db.DBConnection;
import db.MySQLConnection;

public class CacheConnectionFactory {
	// This should change based on the pipeline.
			private static final String DEFAULT_CACHE = "SingleRedisConnection";
			
			public static CacheConnection getConnection(String db) {
				switch (db) {
				case "SingleRedisConnection":
					return new SingleRedisConnection();
				default:
					throw new IllegalArgumentException("Invalid db:" + db);
				}

			}

			public static CacheConnection getConnection() {
				return getConnection(DEFAULT_CACHE);
			}
}
