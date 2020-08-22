package com.kce.service;

import java.util.Scanner;

import com.kce.bean.Curriculam;
import com.kce.bean.Student;
import com.kce.dao.CurriculamDatabase;
import com.kce.dao.NonCurriculamDatabase;
import com.kce.dao.StudentDatabase;
import com.kce.util.DBConnection;
//MAIN CLASS
public class MainClass {
	public static void main(String[] args) throws Exception {
		StudentDatabase sd=new StudentDatabase();
		CurriculamDatabase cd=new CurriculamDatabase();
		NonCurriculamDatabase nd=new NonCurriculamDatabase();
		
		sd.createTable();//CALL THE METHOD TO CREATE THE TABLE
		sd.displayAll();//CALL THE METHOD TO DISPLAY THE TABLE
		System.out.println("---------------------------------------------");
		cd.createTable();//CALL THE METHOD TO CREATE THE TABLE
		cd.displayAll();//CALL THE METHOD TO DISPLAY THE TABLE
		cd.trackActivity();//CALL THE METHOD TO TRACK THE ACTIVITY
		System.out.println("---------------------------------------------");
		nd.createTable();//CALL THE METHOD TO CREATE THE TABLE
		nd.displayAll();//CALL THE METHOD TO DISPLAY THE TABLE
		nd.trackActivity();//CALL THE METHOD TO TRACK THE ACTIVITY
		System.out.println("---------------------------------------------");
		System.out.println("\n Program Successfully Runned!!!\n");
	}

}