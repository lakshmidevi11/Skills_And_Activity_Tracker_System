package com.kce.bean;

public class NonCurriculam {
	private int s_rollno;
	private String dance;
	private String music;
	private String sports;
	private String painting;
public NonCurriculam() {
	super();
	
}
public int getS_rollno() {
	return s_rollno;
}
public void setS_rollno(int s_rollno) {
	this.s_rollno = s_rollno;
}
public String getDance() {
	return dance;
}
public void setDance(String dance) {
	this.dance = dance;
}
public  String getMusic() {
	return music;
}
public void setMusic(String music) {
	this.music = music;
}
public String getSports() {
	return sports;
}
public void setSports(String sports) {
	this.sports = sports;
}
public String getPainting() {
	return painting;
}
public void setPainting(String painting) {
	this.painting = painting;
}
@Override
public String toString() {
	return "NonCurriculam [s_rollno=" + s_rollno + ", dance=" + dance + ", music=" + music + ", sports=" + sports
			+ ", painting=" + painting + "]";
}

}
