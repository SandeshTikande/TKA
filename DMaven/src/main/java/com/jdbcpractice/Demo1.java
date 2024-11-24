package com.jdbcpractice;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
	public void insertdata()throws Exception { 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        Statement s = c.createStatement();
        s.executeUpdate("INSERT INTO animal (name, color) VALUES ('cat', 'black')");
        System.out.println("Data inserted successfully");
        c.close();
        }
	public void updatedata()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("update animal set colour='white' where id =1");
		System.out.println("Data is inserted...");
		s.close();
		
		
	}
	public void deletedata ()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("delete from animal where id=3");
		System.out.println("data is inserted......");
		s.close();
		
		
	}
	public void fetchdata() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        Statement s = c.createStatement();
      
        ResultSet rs = s.executeQuery("SELECT * FROM animal");
        
      
        while (rs.next()) {
        	int id=rs.getInt("id");
            String name = rs.getString("name");
            String color = rs.getString("color");
            System.out.println("ID:"+ id +",  Animal: " + name + ", Colour: " + color);
        }
    
        rs.close();
        s.close();
        
    }


    public static void main(String[] args) throws Exception {
    	Demo1 d=new Demo1();
    	d.insertdata();
    	//d.updatedata();
        //d.deletedata();
    	//d.fetchdata();
    }
}
