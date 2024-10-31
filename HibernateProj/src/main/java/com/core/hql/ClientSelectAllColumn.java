package com.core.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.core.entityes.Products;

public class ClientSelectAllColumn {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select * from Products
		
		Query query = session.createQuery("from Products");
		
		List<Products> p = query.list();
		
		for(Products p1 : p) {
			System.out.println(p1.getPid()+" "+p1.getPname());
		}
		
	}

}
