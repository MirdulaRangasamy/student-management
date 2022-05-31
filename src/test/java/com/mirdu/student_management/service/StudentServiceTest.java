package com.mirdu.student_management.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class StudentServiceTest {
	StudentService ss = new StudentService();
	@Ignore
	@Test
	public void testCreateStudent() {
		assertTrue(ss.createStudent(1));
	}

	@Ignore
	@Test
	public void testUpdateStudent() {
		assertEquals(1,ss.updateStudent(101));
	}

	@Ignore
	@Test
	public void testDeleteStudent() {
		assertEquals(1,ss.deleteStudent(103));
	}
	
	@Test
	public void testViewStudent() {
		assertNotNull(ss.viewStudent(201));
	}
	
	@Test
	public void testViewStudents() {
		assertNotNull(ss.viewStudents());
	}

}
