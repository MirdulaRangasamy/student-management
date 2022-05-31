package com.mirdu.student_management;

import java.util.Scanner;

import com.mirdu.student_management.entity.Student;
import com.mirdu.student_management.service.StudentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		int rollno;
		char ch = 'Y';
		while(ch == 'Y')
		{
		System.out.println("*********STUDENT MANAGEMENT SYSTEM***********");
		System.out.println("1)Add Student\n2)View Student\n3)View Students\n4)Update Student\n5)Delete Student");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int option = ip.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("Enter the number of Students:");
				int count = ip.nextInt();
				ss.createStudent(count);
				break;
			case 2:
				System.out.println("Enter the roll number of Student:");
				rollno = ip.nextInt();
				System.out.println(ss.viewStudent(rollno));
				break;
			case 3:
				for(Student s:ss.viewStudents())
				{
					System.out.println(s);
				}
				break;
			case 4:
				System.out.println("Enter the roll number of Student:");
				rollno = ip.nextInt();
				ss.updateStudent(rollno);
				break;
			case 5:
				System.out.println("Enter the roll number of Student:");
				rollno = ip.nextInt();
				ss.deleteStudent(rollno);
				break;
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		System.out.println("Enter Y to continue...");
		ch = ip.next().charAt(0);
		}
		System.out.println("Thankyou for using...");
	}
}
