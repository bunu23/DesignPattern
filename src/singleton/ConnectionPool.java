package singleton;

public class ConnectionPool {
	
	//declare a private static instance of a class
private static ConnectionPool pool=new ConnectionPool();
//this is a pool with only one connection
private Connection connection=new Connection();

private ConnectionPool() {}

//add a static method to get an instance of a singleton class
public static ConnectionPool getPool() {
	return pool;
	}

public Connection getConnection() {
	return connection;
}


}

