package com.kce.bean;

public class Curriculam {
	private int s_rollno;;
	private String workshop;
	private String presentation;
	private String conference;
	private String project;
public Curriculam() {
	super();	
}
public int getS_rollno() {
	return s_rollno;
}
public  void setS_rollno(int s_rollno) {
	this.s_rollno =s_rollno;
}
public  String getWorkshop() {
	return workshop;
}
public  void setWorkshop(String workshop) {
	this.workshop = workshop;
}
public  String getPresentation() {
	return presentation;
}
public  void setPresentation(String presentation) {
	this.presentation = presentation;
}
public  String getConference() {
	return conference;
}
public  void setConference(String conference) {
	this.conference = conference;
}

public final String getProject() {
	return project;
}
public final void setProject(String project) {
	this.project = project;
}
@Override
public String toString() {
	return "Curriculam [rollno:" + s_rollno + ", workshop:" + workshop + ", presentation:" + presentation
			+ ", conference:" + conference + ", project:" + project + "]";
}

}
