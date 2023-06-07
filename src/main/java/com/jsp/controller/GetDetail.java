package com.jsp.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import com.jsp.services.SchoolManagementServices;

public class GetDetail {

	static SchoolManagementServices schoolManagementServices = new SchoolManagementServices();

	public static void main(String[] args) {
		System.out.println("Select choice 1.getStudentDetail 2.getTeacherDetail ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		switch (a) {
		case 1:
			List<Student> students = schoolManagementServices.getAllStudents();

			for (Student s : students) {
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getEmail());
				System.out.println(s.getCourse());
				System.out.println("==============");
			}
			break;
		case 2:
			List<Teacher> teachers = schoolManagementServices.getAllTeachers();

			for (Teacher s : teachers) {
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getEmail());
				System.out.println(s.getSubject());
				System.out.println("==============");
			}

			break;

		default:
			break;
		}

	}

}
