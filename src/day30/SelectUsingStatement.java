package day30;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		
		Statement st=connection.createStatement();
		
		String query="select ename,sal from emp where eno=3";
		
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
			System.out.println(rs.getString(1) + " " + rs.getDouble(2));
		
		rs.close();
		st.close();
		connection.close();
	}

}
