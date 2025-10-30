package day30;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BatchDemo {

	public static void main(String[] args) throws Exception
	{
		try
		{
		Connection connection = MySqlDatabaseConnection.getConnection();
		connection.setAutoCommit(false);
		 
		Statement st=connection.createStatement();
		
		String query1="insert into emp values(12,'Lilly',1800.0)";
		String query2="update emp set sal=sal+500 where sal<1000";
		
		st.addBatch(query1);
		st.addBatch(query2);
		
		int rows[]=st.executeBatch();
		connection.commit();
		System.out.println(Arrays.stream(rows).sum() + " Records Affected ");
		st.close();
		connection.close();
		}
		catch(SQLException ex1)
		{
			System.out.println(ex1.getMessage());
		}
	}

}
