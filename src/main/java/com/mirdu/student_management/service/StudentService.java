package com.mirdu.student_management.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.mirdu.student_management.dao.StudentDAO;
import com.mirdu.student_management.entity.Student;

public class StudentService {
	private StudentDAO studDao = new StudentDAO();
	Scanner ip = new Scanner(System.in);
	public boolean createStudent(int count)
	{
		while(count > 0)
		{
			System.out.println("Enter the student details:");
			System.out.println("Enter the rollno:");
			int rollno = ip.nextInt();
			System.out.println("Enter the Name:");
			String name = ip.next();
			System.out.println("Enter the Department:");
			String dept = ip.next();
			System.out.println("Enter the year:");
			int year = ip.nextInt();
			System.out.println("Enter the CGPA:");
			float cgpa = ip.nextFloat();
			studDao.insertStudent(rollno, name, dept, year, cgpa);
			count--;
		}
		return true;
	}
	
	public int updateStudent(int rollno)
	{
		System.out.println("Enter the Name:");
		String name = ip.next();
		System.out.println("Enter the Department:");
		String dept = ip.next();
		System.out.println("Enter the year:");
		int year = ip.nextInt();
		System.out.println("Enter the CGPA:");
		float cgpa = ip.nextFloat();
		return studDao.updateStudent(rollno, name, dept, year, cgpa);
	}
	
	public int deleteStudent(int rollno)
	{
		
		return studDao.deleteStudent(rollno);
	}
	
	public Student viewStudent(int rollno)
	{
		return studDao.viewStudent(rollno);
	}
	
	public ArrayList<Student> viewStudents()
	{
		return studDao.viewStudents();
	}
}
