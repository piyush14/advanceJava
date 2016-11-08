package com.hibernate.EmployeDemo;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.HibernateDemo.Product;

public class EmployeMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// add employee
		/*
		 * Session session_1 = sessionFactory.openSession();
		 * 
		 * Employee emp = new Employee("MNB", 9700,"pune"); Transaction
		 * transaction = session_1.beginTransaction();
		 * 
		 * session_1.save(emp); // Hibernate
		 * 
		 * long productId = emp.getId(); transaction.commit();
		 * session_1.close();
		 */

		// total salary of all employes HQL query
		Session session_2 = sessionFactory.openSession();

		Query q = session_2.getNamedQuery("salaryOfAllEmployes");
		List<Employee> list = q.list();
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("total salary of all employes" + itr.next());
		}

		session_2.close();
		// employe ordered by salary HQL query
		Session session_3 = sessionFactory.openSession();

		Query q1 = session_3.getNamedQuery("employesOrderedBySal");// ("employesOrderedBySal");
		List<Employee> list_emp = q1.list();
		for (Employee product_3 : list_emp) {
			System.out.println(product_3);
		}

		// employe ordered by salary criteria query

		Criteria cr = session_3.createCriteria(Employee.class);
		cr.addOrder(Order.desc("salary"));
		List<Employee> result = cr.list();
		for (Employee product_3 : result) {
			System.out.println(product_3);
		}
		session_3.close();

		// Group the employees based upon their city HQL query
		Session session_4 = sessionFactory.openSession();
		Query query_2 = session_4.getNamedQuery("empBasedOnCity");
		List<String> list_emp_byCity = query_2.list();
		for (String product_3 : list_emp_byCity) {
			System.out.println(product_3);
		}
		// Group the employees based upon their city criteria query
		Criteria cr1 = session_4.createCriteria(Employee.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("city"));
		projList.add(Projections.groupProperty("city"));
		cr1.setProjection(projList);
		List<Employee> results = cr1.list();
		for (Employee product_3 : result) {
			System.out.println(product_3);
		}
		session_4.close();

		// Calculate the average salary of employees. HQL query

		Session session_5 = sessionFactory.openSession();
		Query query_3 = session_5.getNamedQuery("avgSalOfEmp");
		List<Employee> list_sal = query_3.list();
		Iterator<Employee> itr_2 = list_sal.iterator();
		while (itr_2.hasNext()) {
			System.out.println("avg salary of all employes " + itr_2.next());
		}

		// Calculate the average salary of employees. Criteria query

		Criteria cr2 = session_5.createCriteria(Employee.class);
		cr2.setProjection(Projections.avg("salary"));
		List avg = cr2.list();

		System.out.println("avg salary of all employes " + avg);

		session_5.close();

		// List down employees having salary more than 10,000. HQL query

		Session session_6 = sessionFactory.openSession();
		Query query_6 = session_6.getNamedQuery("salGt1000");
		List<Employee> list_sal_greater = query_6.list();
		Iterator<Employee> itr_6 = list_sal_greater.iterator();
		while (itr_6.hasNext()) {
			System.out.println(" salary of all employes  > 10000  : " + itr_6.next());
		}

		// List down employees having salary more than 10,000. criteria query
		Criteria cr6 = session_6.createCriteria(Employee.class);
		cr6.add(Restrictions.gt("salary", 10000.00));
		List<Employee> result_sal = cr6.list();
		for (Employee sal : result_sal) {
			System.out.println(sal);
		}
		session_6.close();
		sessionFactory.close();
	}

}
