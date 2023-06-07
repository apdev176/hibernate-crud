package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class SchoolManagementDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ap");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//save
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public Teacher saveTeacher(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	
	
	//getById
	public Student getStudentById(int id) {
		return entityManager.find(Student.class,id);
	}
	public Teacher getTeacherById(int id) {
		return entityManager.find(Teacher.class,id);
	}
	
	
	//updates
	public Student updateStudentName(int id,Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}
		else {
			return null;
		}
	}
	
	public Teacher updateTeacherName(int id,Teacher teacher) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}
		else {
			return null;
		}
	}
	
	public Student updateStudentEmail(int id,Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}
		else {
			return null;
		}
	}
	
	public Teacher updateTeacherEmail(int id,Teacher teacher) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}
		else {
			return null;
		}
	}
	
	public Student updateStudentCourse(int id,Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}
		else {
			return null;
		}
	}
	
	public Teacher updateTeacherSubject(int id,Teacher teacher) {
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}
		else {
			return null;
		}
	}
	
	//getAll
	public List<Student> getAllStudents(){
		String jpql="SELECT s FROM Student s";
		Query query=entityManager.createQuery(jpql);
		List <Student> students = query.getResultList();
		return students;
		}
	
	public List<Teacher> getAllTeachers(){
		String jpql="SELECT t FROM Teacher t";
		Query query=entityManager.createQuery(jpql);
		List <Teacher> teachers = query.getResultList();
		return teachers;
		}
	
	//deleteById
      public boolean deleteStudentById(int id) {
		
		Student student = getStudentById(id); //or Product product = entityManager.find(Product.class,id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
		}
      
      public boolean deleteTeacherById(int id) {
  		
  		Teacher teacher = getTeacherById(id); //or Product product = entityManager.find(Product.class,id);
  		entityTransaction.begin();
  		entityManager.remove(teacher);
  		entityTransaction.commit();
  		return true;
  		}
}
