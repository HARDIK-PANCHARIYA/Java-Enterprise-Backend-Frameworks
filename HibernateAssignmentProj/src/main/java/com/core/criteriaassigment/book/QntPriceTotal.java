package com.core.criteriaassigment.book;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.core.criteriaassigment.entity.Book;

public class QntPriceTotal {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query q = session.createQuery(
			    "select b.bookname, b.author, b.price, b.qty, sum(b.price * b.qty) as total " +
			    "from Book b " +
			    "group by b.bookname, b.author, b.price, b.qty"
			);




		List<Object[]> result = q.list();
		for (Object[] row : result) {
		    String bookName = (String) row[0];
		    String authorName = (String) row[1];
		    Double price = (Double) row[2];   
		    Integer qty = (Integer) row[3];   
		    Double total = (Double) row[4]; 
		    System.out.println(bookName + " -> " + authorName + " -> " + price + " -> " + qty + " -> " + total);
		}




		
	}

}
