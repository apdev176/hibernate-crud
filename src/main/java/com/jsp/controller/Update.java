package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;
import com.jsp.services.SchoolManagementServices;

public class Update {

		static SchoolManagementServices schoolManagementServices=new SchoolManagementServices();
		
		public static void main(String[] args) {
			System.out.println("Select choice 1.updateStudent 2.updateTeacher ");
			Scanner scanner =new Scanner(System.in);
			int a =scanner.nextInt();

			switch (a) {
			case 1:
				System.out.println("Select choice 1.updateName 2.updateEmail 3.updateCourse");
				int updateStudent=scanner.nextInt();
				
				switch (updateStudent) {
				case 1:
					System.out.println("Enter id:");
					int idStudent1=scanner.nextInt();
					System.out.println("Enter new name:");
					scanner.nextLine();
					String newName=scanner.nextLine();
					Student student=schoolManagementServices.updateStudentName(idStudent1, newName);
					System.out.println("new name "+student.getName()+" updated");
					break;
				case 2:
					System.out.println("Enter id:");
					int idStudent2=scanner.nextInt();
					System.out.println("Enter new email:");
					scanner.nextLine();
					String newEmail=scanner.nextLine();
					Student student2=schoolManagementServices.updateStudentEmail(idStudent2, newEmail);
					System.out.println("new email "+student2.getEmail()+" updated");
					break;
				case 3:
					System.out.println("Enter id:");
					int idStudent3=scanner.nextInt();
					System.out.println("Enter new course:");
					scanner.nextLine();
					String newCourse=scanner.nextLine();
					Student student3=schoolManagementServices.updateStudentCourse(idStudent3, newCourse);
					System.out.println("new course "+student3.getCourse()+" updated");
					break;

				default:
					System.out.println("wrong choice:");
					break;
				}
				break;
			case 2:
				System.out.println("Select choice 1.updateName 2.updateEmail 3.updateCourse");
				int updateTeacher=scanner.nextInt();
				
				switch (updateTeacher) {
				case 1:
					System.out.println("Enter id:");
					int idTeacher1=scanner.nextInt();
					System.out.println("Enter new name:");
					scanner.nextLine();
					String newName=scanner.nextLine();
					Teacher teacher=schoolManagementServices.updateTeacherName(idTeacher1, newName);
					System.out.println("new name "+teacher.getName()+" updated");
					break;
				case 2:
					System.out.println("Enter id:");
					int idTeacher2=scanner.nextInt();
					System.out.println("Enter new email:");
					scanner.nextLine();
					String newEmail=scanner.nextLine();
					Teacher teacher2=schoolManagementServices.updateTeacherEmail(idTeacher2, newEmail);
					System.out.println("new email "+teacher2.getEmail()+" updated");
					break;
				case 3:
					System.out.println("Enter id:");
					int idTeacher3=scanner.nextInt();
					System.out.println("Enter new Subject:");
					scanner.nextLine();
					String newSubject=scanner.nextLine();
					Teacher teacher3=schoolManagementServices.updateTeacherSubject(idTeacher3, newSubject);
					System.out.println("new subject "+teacher3.getSubject()+" updated");
					break;
					
				default:
					System.out.println("wrong choice:");
					break;
				}
				
				break;

			default:
				System.out.println("wrong choice:");
				break;
			}
	}

}
