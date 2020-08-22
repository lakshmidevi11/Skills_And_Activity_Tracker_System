package com.kce.dao;

import java.sql.*;
import com.kce.bean.Curriculam;
import com.kce.bean.Student;
import com.kce.util.DBConnection;
import java.util.*;
//DATABASE OPERATION
public class CurriculamDatabase {
		Connection con=null;
		public void createTable()throws Exception{
			DBConnection db=new DBConnection();
			Curriculam cu=new Curriculam();
			con=db.Connector();
			Statement s=con.createStatement();
			System.out.println("\nSTUDENT CURRICULAM ACTIVITY TABLE\n");
			String sd="drop table studentcurriculam";
			s.executeUpdate(sd);
			String sc="create table studentcurriculam(s_rollno number,workshop varchar(20),presentation varchar(20),conference varchar(20),project varchar(20))";
			s.executeUpdate(sc);//TABLE CREATION
			System.out.println("Table Created");
			PreparedStatement p=con.prepareStatement("insert into studentcurriculam values(?,?,?,?,?)");//VALUES INSERTION
			System.out.println("The Values Should Be In YES or NO");
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
			cu.setS_rollno(sn.nextInt());
			p.setInt(1,cu.getS_rollno());
			System.out.println("WORKSHOP");
			cu.setWorkshop(sn.next());
			p.setString(2,cu.getWorkshop());
			System.out.println("PRESENTATION");
			cu.setPresentation(sn.next());
			p.setString(3,cu.getPresentation());
			System.out.println("CONFERENCE");
			cu.setConference(sn.next());
			p.setString(4,cu.getConference());
			System.out.println("PROJECT");
			cu.setProject(sn.next());
			p.setString(5,cu.getProject());
			p.executeUpdate();
			}
			System.out.println("Do U Want To Continue...?(Y/N)");
			ans=sn.next().charAt(0);
			}while(ans=='y'|| ans=='Y');	
		}
		public void displayAll() throws SQLException //DISPLAY ALL DETAILS
		{
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from studentcurriculam");
			while(rs.next())
			{
				System.out.println("Rollno:"+rs.getInt(1)+""+"Workshop:"+rs.getString(2)+""+"Presentation:"+rs.getString(3)+""+"Conference:"+rs.getString(4)+""+"Project:"+rs.getString(5));
				
			}
		}
		public void trackActivity() throws SQLException{ //ACTIVITY TRACKER
			Statement s=con.createStatement();
			Scanner sc=new Scanner(System.in);
			String q1="select s_rollno,workshop from studentcurriculam where workshop='YES' or workshop='yes'";
			String q2="select s_rollno,presentation from studentcurriculam where presentation='YES' or presentation='yes'";
			String q3="select s_rollno,conference from studentcurriculam where conference='YES' or conference='yes'";
			String q4="select s_rollno,project from studentcurriculam where project='YES' or  project='yes'";
			int choice;
			System.out.println("Which Detail U Want To Know In Curriculam Activity \n1.workshop\n2.presentation \n3.conference \n4.project ");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice){
			case 1: ResultSet rs=s.executeQuery(q1);
			while(rs.next()){
				System.out.println("The Rollno Of The Student is:"+rs.getInt(1));
			}break;
			case 2: ResultSet rs1=s.executeQuery(q2);
			while(rs1.next()){
				System.out.println("The Rollno Of The Student is:"+rs1.getInt(1));
			}break;
			case 3:ResultSet rs2=s.executeQuery(q3);
			while(rs2.next()){
				System.out.println("The Rollno Of The Student is:"+rs2.getInt(1));		}
			break;
			case 4:ResultSet rs3=s.executeQuery(q4);
			while(rs3.next()){
				System.out.println("The Rollno Of The Student is:"+rs3.getInt(1));		}
			break;
			}
		}
}
