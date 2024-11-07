package com.core.criteriaassigment.book;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.criteriaassigment.entity.Book;

public class InsertBookMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Book b1 = new Book("Pride and Prejudice","Jane Austen",200,50);
//		session.save(b1);
		
		Book b2 = new Book("The Book Thief","Markus Zusak",340,20);
		Book b3 = new Book("1984","George Orwell",130,10);
		Book b4 = new Book("Beloved","Tone Morrison",600,22);
		
		ArrayList<Book> blist = new ArrayList<Book>();
		blist.add(b2);
		blist.add(b3);
		blist.add(b4);
		
		for(Book b : blist) {
			session.save(b);
		}
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		System.out.println("Data insert done");
		
	}

}
