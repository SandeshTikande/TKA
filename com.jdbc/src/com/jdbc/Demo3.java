package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo3 {
	
	public void inserdata() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s= c.createStatement();
		s.executeUpdate("insert into mobiles values(5,133384,'nokia')");
		System.out.println("data is inserted....");
		s.close();
	}
	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s= c.createStatement();
		s.executeUpdate("update mobiles set ip_add= 222222,mobile_name='apple'  where id=2");
		System.out.println("data is inserted....");
		s.close();
		
	}
	public void deletedata() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("delete from mobiles where id=2");
		System.out.println("data is inserted.");
        s.close();
		
		
		 
	}

	public static void main(String[] args) throws Exception {
		Demo3 d=new Demo3(); 
		//d.inserdata();
		//d.updatedata();
		d.deletedata();
		
	}

}
