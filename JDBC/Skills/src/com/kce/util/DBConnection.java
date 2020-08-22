package com.kce.util;
import java.sql.*;
public class DBConnection {
	public Connection Connector() throws Exception
	{
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1433:XE","SYS","SYSDBA");
		Statement s=con.createStatement();
		return con;
	}

}
