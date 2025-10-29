package day30;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDatabaseConnection {

	public static Connection getConnection() throws Exception
	{
		String jdbcDriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="";
		String databaseUrl="jdbc:mysql://localhost:3306/";
		String databaseName="itpaugdb";
		
		Class.forName(jdbcDriver);
		Connection connection = DriverManager.getConnection(databaseUrl+databaseName, username, password);
		return connection;
	}
}
