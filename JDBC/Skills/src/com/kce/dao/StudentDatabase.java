package com.kce.dao;

import java.sql.*;
import com.kce.bean.Student;
import com.kce.util.DBConnection;
import java.util.*;
//DATABASE OPERATION
public class StudentDatabase {
	Connection con=null;
	public void createTable()throws Exception{
		DBConnection db=new DBConnection();
		Student st=new Student();
		con=db.Connector();
		Statement s=con.createStatement();
		System.out.println("\nSTUDENT TABLE\n");
		String sd="drop table studentskill";
		s.executeUpdate(sd);
		String sc="create table studentskill(S_rollno number,s_name varchar(20),s_dept varchar(10))";
		s.executeUpdate(sc);//TABLE CREATION
		System.out.println("Table Created");
		PreparedStatement p=con.prepareStatement("insert into studentskill values(?,?,?)");//VALUES INSERTION
		System.out.println("Enter The Number Of Records To Be Inserted");
		int i;
		String sr;
		Scanner sn=new Scanner(System.in);
		int n = sn.nextInt();
		char ans;
		do {
		for(i=0;i<n;i++)
		{
		System.out.println("ROLLNO");
		st.setS_rollno(sn.nextInt());
		p.setInt(1, st.getS_rollno());
		System.out.println("NAME");
		st.setS_name(sn.next());
		p.setString(2,st.getS_name());
		System.out.println("DEPARTMENT");
		st.setS_dept(sn.next());
		p.setString(3,st.getS_dept());
		p.executeUpdate();
		}
		System.out.println("Do U Want To Continue...?(Y/N)");
		ans=sn.next().charAt(0);
		}while(ans=='y'|| ans=='Y');	
	}
	public void displayAll() throws SQLException //DISPLAY ALL DETAILS
	{
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from studentskill");
		while(rs.next())
		{
			System.out.println("Rollno:"+rs.getInt(1)+""+"Name:"+rs.getString(2)+""+"Department:"+rs.getString(3));
			
		}
	}
	
	}	
