package com.core.criteriaassigment.book;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.criteriaassigment.entity.Book;

public class SearchByAuthor {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Book where author =:a");
		query.setParameter("a", "George Orwell");
		
		List<Book> blist = query.list();
		
		for(Book b : blist) {
			System.out.println(b.getBookname()+" "+b.getAuthor());
		}
		
		
	}

}
