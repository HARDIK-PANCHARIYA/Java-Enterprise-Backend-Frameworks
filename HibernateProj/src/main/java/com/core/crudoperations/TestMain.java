package com.core.crudoperations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.entityes.Test;

public class TestMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new  Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Test.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Test t = new Test("abcd",new Date(),3.2);
		session.save(t);
		
//		Test t = new Test(null,new Date(),3.2);
//		session.save(t);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
	}

}
