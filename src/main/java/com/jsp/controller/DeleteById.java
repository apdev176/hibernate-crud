package com.jsp.controller;

import java.util.Scanner;
import com.jsp.services.SchoolManagementServices;


public class DeleteById {

static SchoolManagementServices schoolManagementServices=new SchoolManagementServices();
	
	public static void main(String[] args) {
		System.out.println("Select choice 1.DeletByStudentId 2.DeleteByTeacherId: ");
		Scanner scanner =new Scanner(System.in);
		int a =scanner.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Enter the Id:");
			int studentId=scanner.nextInt();
			boolean flag=schoolManagementServices.deleteStudentById(studentId);
			if(flag==true) {
				System.out.println("deleted");
			}
			else {
				System.out.println("Not deleted");
			}
			break;
		
		case 2:
			System.out.println("Enter the Id:");
			int teacherId=scanner.nextInt();
			boolean flag2=schoolManagementServices.deleteTeacherById(teacherId);
			if(flag2==true) {
				System.out.println("deleted");
			}
			else {
				System.out.println("Not deleted");
			}
			
          break;
		default:
			System.out.println("wrong choice");
			break;
		}
	}
}
