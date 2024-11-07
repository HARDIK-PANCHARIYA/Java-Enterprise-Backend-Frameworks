package com.core.criteriaassigment.book;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.criteriaassigment.entity.Book;

public class DeleteBybookName {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("Delete from Book where bookname=:d");
		q.setParameter("d", "1984");
		q.executeUpdate();
		tx.commit();
		
		
		
		System.out.println("Delete successfully");

	}

}
