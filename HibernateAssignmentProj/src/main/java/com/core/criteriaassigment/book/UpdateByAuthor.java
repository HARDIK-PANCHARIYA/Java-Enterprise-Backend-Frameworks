package com.core.criteriaassigment.book;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.criteriaassigment.entity.Book;

public class UpdateByAuthor {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String aut = "Jane Austen";
		double p = 800;
		
		Query q = session.createQuery("update Book set price=:p where author=:a");
		q.setParameter("a", aut);
		q.setParameter("p", p);
		int r = q.executeUpdate();
		tx.commit();
		
		System.out.println("Update Successfully"+ r);
		

	}

}
