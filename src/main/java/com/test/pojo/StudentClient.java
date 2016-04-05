package com.test.pojo;

import org.hibernate.Session;

import com.test.util.HibernateUtil;

public class StudentClient {
	
	public static void main(String[] args){
		
		persistData();
	}
	
	 public static void persistData(){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 
		 Student student = new Student();
		 student.setId(1);
		 student.setName("Rishit");
		 student.setOrder("book");
		 
		 session.save(student);
		 session.getTransaction().commit();
		
	 }

}
