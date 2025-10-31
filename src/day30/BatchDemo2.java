package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchDemo2 {

	public static void main(String[] args) throws Exception
	{
		try(Connection connection = MySqlDatabaseConnection.getConnection())
		{
		connection.setAutoCommit(false);
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter ename");
		String b=sc.next();
		
		System.out.println("Enter salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		
		ps1=connection.prepareStatement(query);
		ps1.setInt(1, a);
		ps1.setString(2, b);
		ps1.setDouble(3, c);
		
		ps1.addBatch();
		
		System.out.println("Enter salary Increment");
		double d=sc.nextDouble();
		
		String query2="update emp set sal=sal+? where sal<1000";
		ps2=connection.prepareStatement(query2);
		ps2.setDouble(1, d);
		ps2.addBatch();
		
		
		int rows1[]=ps1.executeBatch();
		int rows2[]=ps2.executeBatch();
		
		connection.commit();
		System.out.println((Arrays.stream(rows1).sum() + Arrays.stream(rows2).sum()) + " Records Affected ");
		ps1.close();
		ps2.close();
		}
		catch(SQLException ex1)
		{
			System.out.println(ex1.getMessage());
		}
	}

}
