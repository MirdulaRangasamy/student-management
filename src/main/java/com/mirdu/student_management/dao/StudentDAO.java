package com.mirdu.student_management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mirdu.student_management.entity.Student;

public class StudentDAO {
	private Connection con;
	private Statement st;
	
	
	public Connection getConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6835", "root", "Kuzhazhi@123456");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return con;
	}
	
	public int insertStudent(int rollno, String name, String dept, int year, float cgpa)
	{
		int n = 0;
		try {
			con = getConnect();
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?)");
			pst.setInt(1, rollno);
			pst.setString(2, name);
			pst.setString(3, dept);
			pst.setInt(4, year);
			pst.setFloat(5, cgpa);
			n = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int updateStudent(int rollno, String name, String dept, int year, float cgpa)
	{
		int n = 0;
		String sql = "update student set name='"+name+"',dept='"+dept+"',year="+year+",cgpa="+cgpa+" where rollno="+rollno;
		System.out.println(sql);
		try {
			con = getConnect();
			st = con.createStatement();
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deleteStudent(int rollno)
	{
		int n = 0;
		String sql = "delete from student where rollno="+rollno;
		System.out.println(sql);
		try {
			con = getConnect();
			st = con.createStatement();
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public Student viewStudent(int rollno)
	{
		try {
			con = getConnect();
			ResultSet rs = null;
			st = con.createStatement();
			String sql = "select * from student where rollno = "+rollno;
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Student> viewStudents()
	{
		ArrayList<Student> al = new ArrayList<Student>();
		try {
			con = getConnect();
			ResultSet rs = null;
			st = con.createStatement();
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				al.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5)));
			}
			return al;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

