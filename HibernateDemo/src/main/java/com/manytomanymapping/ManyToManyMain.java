package com.manytomanymapping;

import java.io.File;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManyToManyMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
	//	addData(transaction, session);
//		deleteData(transaction, session);
	//	updateData(transaction, session);
		
//		Session session_1 = sessionFactory.openSession();
//		Transaction transaction_1 = session_1.beginTransaction();
//		
//		
//		Student s2 =(Student) session_1.get(Student.class, student_1.getStudentId());
//		System.out.println(s2.getStudentId());
//		session_1.delete(s2);
//		transaction_1.commit();
//		session_1.close();

	}
	
	public static void deleteData(Transaction transaction, Session session) {
		Student student = (Student) session.load(Student.class, 1L);
		
		student.getCourses().remove(student);
		session.delete(student);
		transaction.commit();
		session.close();
		System.out.println("deleted successfully");
	}
	
	
	public static void addData(Transaction transaction, Session session){
		Course course_1 = new Course("Science");
		Course course_2 = new Course("Commerse");
		
		Student student_1 = new Student("Piyush");
		Student student_2 = new Student("Vishal");
		
		student_1.getCourses().add(course_1);
		student_1.getCourses().add(course_2);
		
		student_2.getCourses().add(course_1);
		
		session.save(student_1);
		session.save(student_2);
		transaction.commit();
		session.flush();
		session.close();
	}
	
	public static void updateData(Transaction transaction, Session session) {
		Student student = (Student) session.load(Student.class, 1L);
		Set<Course> course = student.getCourses();
		student.setName("aaa");
		course.forEach(s -> s.setSubject("ppp"));
		student.setCourses(course);
		// session.save(market);
		session.update(course);
		transaction.commit();
		session.close();
		System.out.println("value updated");

	}

}
