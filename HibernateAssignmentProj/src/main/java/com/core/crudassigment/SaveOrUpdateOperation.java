package com.core.crudassigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateOperation {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory =  cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p = new Product(106,"Table",2,350);
		session.saveOrUpdate(p);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Save and Update successfully");

	}

}
