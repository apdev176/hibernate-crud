package com.jsp.services;

import java.util.List;

import com.jsp.dao.SchoolManagementDao;
import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class SchoolManagementServices {

	SchoolManagementDao schoolManagementDao=new SchoolManagementDao();
	
	//saveServices
	public Student saveStudent(Student student) {
		return schoolManagementDao.saveStudent(student);
	}
	
	public Teacher saveTeacher(Teacher teacher) {
		return schoolManagementDao.saveTeacher(teacher);
	}
	
	//getByIdServices
	public Teacher getTeacherById(int id) {
		if (id > 0) {
			return schoolManagementDao.getTeacherById(id);
		} else {
			return null;
		}
	}
	
	public Student getStudentById(int id) {
		if (id > 0) {
			return schoolManagementDao.getStudentById(id);
		} else {
			return null;
		}
	}
	
	//updateServices
	public Student updateStudentName(int id, String name) {
	    
		Student student=schoolManagementDao.getStudentById(id);
		student.setName(name);
		return schoolManagementDao.updateStudentName(id, student);
	}
	
    public Student updateStudentEmail(int id, String email) {
	    
		Student student=schoolManagementDao.getStudentById(id);
		student.setEmail(email);
		return schoolManagementDao.updateStudentEmail(id, student);
	}
    
     public Student updateStudentCourse(int id, String course) {
	    
		Student student=schoolManagementDao.getStudentById(id);
		student.setCourse(course);
		return schoolManagementDao.updateStudentEmail(id, student);
	}
    
     public Teacher updateTeacherName(int id, String name) {
 	    
 		Teacher teacher=schoolManagementDao.getTeacherById(id);
 		teacher.setName(name);
 		return schoolManagementDao.updateTeacherName(id, teacher);
 	}
 	
     public Teacher updateTeacherEmail(int id, String name) {
  	    
  		Teacher teacher=schoolManagementDao.getTeacherById(id);
  		teacher.setEmail(name);
  		return schoolManagementDao.updateTeacherEmail(id, teacher);
  	}
     
     public Teacher updateTeacherSubject(int id, String name) {
  	    
  		Teacher teacher=schoolManagementDao.getTeacherById(id);
  		teacher.setSubject(name);
  		return schoolManagementDao.updateTeacherSubject(id, teacher);
  	}
     
     //getAllServices
     public List<Student> getAllStudents() {
 		return schoolManagementDao.getAllStudents();
 	}
     public List<Teacher> getAllTeachers() {
    	 return schoolManagementDao.getAllTeachers();
     }
     
     //deleteById
     public boolean deleteStudentById(int id) {
 		if (id > 0) {
 			return schoolManagementDao.deleteStudentById(id);
 		} else {
 			return false;
 		}
 	}
     
     public boolean deleteTeacherById(int id) {
  		if (id > 0) {
  			return schoolManagementDao.deleteTeacherById(id);
  		} else {
  			return false;
  		}
  	}

}
