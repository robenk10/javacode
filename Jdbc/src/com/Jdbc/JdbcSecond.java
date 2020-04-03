package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSecond {

	public static void main(String[] args) {
		Connection con=null;
	    PreparedStatement stm=null;
	    ResultSet rs=null;
	    PreparedStatement stm1=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");			
		        stm=con.prepareStatement("insert into emp values(?,?,?,?)");
		        stm.setInt(1, 7);
		        stm.setString(2, "aks");
		        stm.setInt(3, 30002);
		        stm.setInt(4, 102);
		        stm.executeUpdate();
				
				 
				/*
				 * stm=con.prepareStatement("delete from emp_log where eid=?"); stm.setInt(1,
				 * 3); stm.executeUpdate();
				 */
       
		        
		     //   stm.executeUpdate("delete from emp where ename = 'abhijit' ");
		        
		        
				stm=con.prepareStatement("select * from emp");
                rs=stm.executeQuery();
			 // rs.afterLast();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			try {
				con.close();
				stm.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
