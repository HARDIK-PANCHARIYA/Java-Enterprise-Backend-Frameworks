package com.core.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.core.entityes.Products;


public class ClientSelectSingleColumn {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Products.class);
		
		// select pname from product
		
		Projection p = Projections.property("pname");
		c.setProjection(p);
		
		List<String> list = c.list();
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
