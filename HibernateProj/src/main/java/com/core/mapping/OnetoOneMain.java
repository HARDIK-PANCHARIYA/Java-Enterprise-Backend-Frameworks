package com.core.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Question q1 = new Question();
//		q1.setQue("What is Java");
//		Question q2 = new Question();
//		q2.setQue("What is Hibernate");
//		
//		Answer a1 = new Answer();
//		a1.setAid(1121);
//		a1.setAns("Java is Object Oriented programming language");
//		Answer a2 = new Answer();
//		a2.setAid(2211);
//		a2.setAns("Hibernate is orm tool");
//		
//		q1.setAnswer(a1);
//		q2.setAnswer(a2);
//		
//		session.save(q1);
//		session.save(q2);
//		
//		Transaction tx = session.beginTransaction();
//		tx.commit();
		
		Question q = session.load(Question.class,1);
		System.out.println(q.getQid()+" "+q.getQue());
		System.out.println("Answer - "+q.getAnswer().getAns());
		
		System.out.println("Process Done ...... ");
		
		
		
	}

}
