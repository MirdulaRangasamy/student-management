package com.mirdu.student_management.entity;

public class Student {
	private int rollno;
	private String name;
	private String dept;
	private int year;
	
	private float cgpa;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollno, String name, String dept, int year, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.year = year;
		this.cgpa = cgpa;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public float getCgpa() {
		return cgpa;
	}


	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", dept=" + dept + ", year=" + year + ", cgpa=" + cgpa
				+ "]";
	}
	
}
