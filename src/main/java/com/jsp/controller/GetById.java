package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import com.jsp.services.SchoolManagementServices;

public class GetById {

		static SchoolManagementServices schoolManagementServices=new SchoolManagementServices();
		
		public static void main(String[] args) {
			System.out.println("Select choice 1.getStudentId 2.getTeacherId: ");
			Scanner scanner =new Scanner(System.in);
			int a =scanner.nextInt();

			switch (a) {
			case 1:
				System.out.println("Enter Student Id:");
				int idStudent=scanner.nextInt();
				Student student =schoolManagementServices.getStudentById(idStudent);
			       if(student!=null) {
			    	   System.out.println(student.getName());
			    	   System.out.println(student.getEmail());
			    	   System.out.println(student.getCourse());
			       }else {
					System.out.println("Incorrect id");
				}
				break;
			case 2:
				System.out.println("Enter Teacher Id");
				int idTeacher=scanner.nextInt();
				Teacher teacher =schoolManagementServices.getTeacherById(1);
			       if(teacher!=null) {
			    	   System.out.println(teacher.getName());
			    	   System.out.println(teacher.getEmail());
			    	   System.out.println(teacher.getSubject());
			       }else {
					System.out.println("Incorrect id");
				}
				
				break;

			default:
				System.out.println("wrong choice:");
				break;
			}
	}

}
