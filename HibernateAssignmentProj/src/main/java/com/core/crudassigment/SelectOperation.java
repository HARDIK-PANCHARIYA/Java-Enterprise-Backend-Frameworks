package com.core.crudassigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p = session.load(Product.class, 102);
		System.out.println(p);


	}

}
