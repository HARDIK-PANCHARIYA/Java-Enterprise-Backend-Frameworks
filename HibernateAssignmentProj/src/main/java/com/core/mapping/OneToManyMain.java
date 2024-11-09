package com.core.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employe.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Department d1 = new Department("Tester","Pune");
//		Employe e1 = new Employe(5, "Sakshi");
//		Employe e2 = new Employe(6, "Yash");
//		Employe e3 = new Employe(7, "Om");
//		Employe e4 = new Employe(8, "Ram");
//		
//		ArrayList<Employe> emplist = new ArrayList<Employe>();
//		emplist.add(e1);
//		emplist.add(e2);
//		emplist.add(e3);
//		emplist.add(e4);
//		
//		d1.setEmplist(emplist);
//		
//		session.save(d1);
//		Transaction tx = session.beginTransaction();
//		tx.commit();
		
		//select * from department
		
		Query q = session.createQuery("from Department");
		List<Department> d = q.list();
		for (Department d1 : d) {
		    // Print department details
		    System.out.println(d1.getDeptid() + " " + d1.getDname() + " " + d1.getLoc());

		    // Print employee names
		    d1.getEmplist().forEach(s -> System.out.println(s.getEname()));
		    System.out.println("-----");
		}

		
		
		
//		Department d = session.load(Department.class, 7);
//		System.out.println(d.getDeptid()+" "+d.getDname()+" "+d.getEmplist().get(0).getEname());
		
		System.out.println("Process done");
		
		
		
	}

}
