package com.core.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.entityes.User;

public class DeleteOperation {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User u = session.load(User.class, 101);
		session.delete(u);
		
//		User u = new User(106,"XYZ","xyz@gmail.com","xyz@1234");
//		session.delete(u);
		
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		System.out.println("Delete successfully");
	}

}
