package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import com.jsp.services.SchoolManagementServices;

public class SaveController {

	static SchoolManagementServices schoolManagementServices = new SchoolManagementServices();

	public static void main(String[] args) {
		System.out.println("Select choice 1.saveStudent 2.saveTeacher ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		switch (a) {
		case 1:
			Student student = new Student();
			System.out.println("Enter Name:");
			scanner.nextLine();
			String student_name = scanner.nextLine();
			student.setName(student_name);
			System.out.println("Enter Email:");
			String student_email = scanner.nextLine();
			student.setEmail(student_email);
			System.out.println("Enter Course:");
			String student_course = scanner.nextLine();
			student.setCourse(student_course);
			Student student2 = schoolManagementServices.saveStudent(student);
			if (student2 != null) {
				System.out.println("saved successfully");
			}
			break;

		case 2:
			Teacher teacher = new Teacher();
			System.out.println("Enter Name:");
			scanner.nextLine();
			String teacher_name = scanner.nextLine();
			teacher.setName(teacher_name);
			System.out.println("Enter Email:");
			String teacher_email = scanner.nextLine();
			teacher.setEmail(teacher_email);
			System.out.println("Enter Subject:");
			String teacher_subject = scanner.nextLine();
			teacher.setSubject(teacher_subject);
			Teacher teacher2 = schoolManagementServices.saveTeacher(teacher);
			if (teacher2 != null) {
				System.out.println("saved successfully");
			}
			break;
		default:
			System.out.println("wrong choice");
			break;
		}

	}

}
