package com.core.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.core.entityes.User;

public class SelectOperation {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		User u = session.load(User.class, 102);
		System.out.println(u);
		
	}

}
