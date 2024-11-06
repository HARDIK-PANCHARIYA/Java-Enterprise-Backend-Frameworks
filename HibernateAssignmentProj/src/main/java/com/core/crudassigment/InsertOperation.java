package com.core.crudassigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertOperation {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
//		Product p = new Product(101,"Pen",4,20.2);
//		Product p = new Product(102,"Pencil",10,30);
//		Product p = new Product(103,"NoteBook",2,80.50);
		Product p = new Product(104,"Marker",5,200);
		session.save(p);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("insert successfully");
		
	}

}
