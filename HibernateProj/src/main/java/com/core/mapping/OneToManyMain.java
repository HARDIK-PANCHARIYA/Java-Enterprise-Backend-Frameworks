package com.core.mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Faculty.class);
		cfg.addAnnotatedClass(FacultySubject.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Faculty f1 = new Faculty("Hardik");
//		FacultySubject s1 = new FacultySubject(121,"Java");
//		FacultySubject s2 = new FacultySubject(433,"Python");
//		FacultySubject s3 = new FacultySubject(543,"React");
//		
//		ArrayList<FacultySubject> fsubList = new ArrayList<FacultySubject>();
//		
//		fsubList.add(s1);
//		fsubList.add(s3);
//		
//		f1.setFsubList(fsubList);
//		
//		session.save(f1);
//		Transaction tx = session.beginTransaction();
//		tx.commit();
		
		Faculty f = session.load(Faculty.class, 3);
		System.out.println(f.getFid()+" "+f.getFname()+" "+f.getFsubList().get(0).getSubname());
		
		
		System.out.println("Process Done");
	}

}
