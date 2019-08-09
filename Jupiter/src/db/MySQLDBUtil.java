package db;

//USE MAMP to store our database
//this is like we are connecting to a remote server with rpc
public class MySQLDBUtil {
	//Information needed to connect to our database
	private static final String HOSTNAME = "mysql";
	private static final String PORT_NUM = "3306"; // change it to your mysql port number
	public static final String DB_NAME = "db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://"
			+ HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
