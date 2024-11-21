package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        Statement s = c.createStatement();
        
        s.executeUpdate("INSERT INTO animal VALUES('dog','black')");
        
        System.out.println("Data inserted successfully.");
        
        s.close();
        c.close();

		

	}

}