package com.createiq.students.model;

public class Student {
	private int Sid;
	private String Sname;
	private double Sfee;
	private String joindate;
	
	public Student() {
		super();
	}
	
	public Student(int Sid,String Sname,double Sfee,String joindate) {
		super();
		this.Sid=Sid;
		this.Sname=Sname;
		this.Sfee=Sfee;
		this.joindate=joindate;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public double getSfee() {
		return Sfee;
	}

	public void setSfee(double sfee) {
		Sfee = sfee;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String toString() {
		
				return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sfee=" + Sfee + ", joindate=" + joindate + "]";
	}
}
