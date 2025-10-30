package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingStatement {
public static void main(String[] args) throws Exception
{

	Connection connection = MySqlDatabaseConnection.getConnection();
	
	Statement st=connection.createStatement();
	
	String query="update emp set sal=sal+100 where eno=4";
	try
	{
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + " Records Updated");

	st.close();
	connection.close();
	}
	catch(SQLException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
