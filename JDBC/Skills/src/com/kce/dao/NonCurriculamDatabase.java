package com.kce.dao;

import java.sql.*;
import com.kce.bean.Curriculam;
import com.kce.bean.NonCurriculam;
import com.kce.bean.Student;
import com.kce.util.DBConnection;
import java.util.*;
//DATABASE OPERATION
public class NonCurriculamDatabase {
			Connection con=null;
			public void createTable()throws Exception{
				DBConnection db=new DBConnection();
				NonCurriculam nu=new NonCurriculam();
				con=db.Connector();
				Statement s=con.createStatement();
				System.out.println("\n STUDENT NONCURRICULAM ACTIVITY TABLE\n");
				String sd="drop table studentnoncurriculam";
				s.executeUpdate(sd);
				String sc="create table studentnoncurriculam(s_rollno number,dance varchar(20),music varchar(20),sports varchar(20),painting varchar(20))";
				s.executeUpdate(sc);//TABLE CREATION
				System.out.println("Table Created");
				PreparedStatement p=con.prepareStatement("insert into studentnoncurriculam values(?,?,?,?,?)");//VALUES INSERTION
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
				nu.setS_rollno(sn.nextInt());
				p.setInt(1,nu.getS_rollno());
				System.out.println("DANCE");
				nu.setDance(sn.next());
				p.setString(2,nu.getDance());
				System.out.println("MUSIC");
				nu.setMusic(sn.next());
				p.setString(3,nu.getMusic());
				System.out.println("SPORTS");
				nu.setSports(sn.next());
				p.setString(4,nu.getSports());
				System.out.println("PAINTING");
				nu.setPainting(sn.next());
				p.setString(5,nu.getPainting());
				p.executeUpdate();
				}
				System.out.println("Do U Want To Continue...?(Y/N)");
				ans=sn.next().charAt(0);
				}while(ans=='y'||ans=='Y');
			}
			public void displayAll() throws SQLException //DISPLAY ALL DETAILS
			{
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from studentnoncurriculam");
				while(rs.next())
				{
					System.out.println(" Rollno:"+rs.getInt(1)+"" +"Dance:"+rs.getString(2)+""+"Music:"+rs.getString(3)+""+"Sports:"+rs.getString(4)+""+"Painting:"+rs.getString(5));
					
				}
			}
		public void trackActivity() throws SQLException{ //ACTIVITY TRACKER
				Statement s=con.createStatement();
				Scanner sc=new Scanner(System.in);
				String q1="select s_rollno,dance from studentnoncurriculam where dance='YES' or dance='yes'";
				String q2="select s_rollno,music from studentnoncurriculam where music='YES' or music='yes'";
				String q3="select s_rollno,sports from studentnoncurriculam where sports='YES' or sports='yes'";
				String q4="select s_rollno,painting from studentnoncurriculam where painting='YES' or painting='yes'";
				int choice;
				System.out.println("Which Detail U Want To Know In NonCurriculam Activity \n1.dance\n2.music \n3.sports \n4.painting ");
				System.out.println("Enter Your Choice");
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