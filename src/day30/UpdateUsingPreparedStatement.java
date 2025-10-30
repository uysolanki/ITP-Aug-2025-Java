package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection connection=MySqlDatabaseConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter salary Hike");
		double c=sc.nextDouble();
		
		String query="update emp set sal=sal+? where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setDouble(1, c);
		ps.setInt(2, a);
		
		int rows=ps.executeUpdate();
		
		System.out.println(rows + " records inserted");
		
		ps.close();
		connection.close();

	}

}
