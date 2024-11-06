package com.core.crudassigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOperation {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Product p = session.load(Product.class,106);
		session.delete(p);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		System.out.println("Record delete successfully");
		
	}

}
