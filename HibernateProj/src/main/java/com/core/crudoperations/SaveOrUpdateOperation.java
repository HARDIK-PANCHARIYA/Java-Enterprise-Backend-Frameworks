package com.core.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.entityes.User;

public class SaveOrUpdateOperation {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		User u = new User(106,"XYZ","xyz@gmail.com","xyz@1234");
		session.saveOrUpdate(u);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Save Update successfully");
	}

}
