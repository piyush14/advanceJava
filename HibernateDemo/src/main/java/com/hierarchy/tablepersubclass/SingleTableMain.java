package com.hierarchy.tablepersubclass;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SingleTableMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Vehicle v1 = new Vehicle("activa", 500000);
		Bike b1 = new Bike("activa", 50000, 125);
		Car c1 = new Car("swift", 900000, 1500);
		
		session.save(v1);
		session.save(b1);
		session.save(c1);
		
		transaction.commit();
		session.close();

	}

}
