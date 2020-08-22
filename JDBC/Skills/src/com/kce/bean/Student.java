package com.kce.bean;

public class Student {
	private int S_rollno;
	private String S_name;
	private String S_dept;
public Student() {
	super();	
}
public  int getS_rollno() {
	return S_rollno;
}
public  void setS_rollno(int s_rollno) {
	S_rollno = s_rollno;
}
public  String getS_name() {
	return S_name;
}
public  void setS_name(String s_name) {
	S_name = s_name;
}
public  String getS_dept() {
	return S_dept;
}
public  void setS_dept(String s_dept) {
	S_dept = s_dept;
}
@Override
public String toString() {
	return "Student [S_rollno:" + S_rollno + ", S_name:" + S_name + ", S_dept:" + S_dept +  "]";
}

}
