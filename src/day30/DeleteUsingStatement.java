package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {
public static void main(String[] args) throws Exception
{

	Connection connection = MySqlDatabaseConnection.getConnection();
	
	Statement st=connection.createStatement();
	
	String query="delete from emp where eno=1";
	try
	{
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + " Records Deleted");

	st.close();
	connection.close();
	}
	catch(SQLException ex)
	{
		System.out.println(ex.getMessage());
	}
}
}
