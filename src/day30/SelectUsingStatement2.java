package day30;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement2 {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		
		Statement st=connection.createStatement();
		
		String query="select sal,ename from emp where sal>=1000";
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getString("ename") + " " + rs.getDouble("sal"));
		
		rs.close();
		st.close();
		connection.close();
	}

}
