package com.core.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import org.hibernate.criterion.Restrictions;

import com.core.entityes.Products;

public class ClientSingleSelectRestriction {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select category from products where price is more than 500
		
		Criteria c = session.createCriteria(Products.class);
		c.add(Restrictions.gt("price", 500));
		
		Projection p = Projections.property("pname");
		c.setProjection(p);
		
		List<String> plist = c.list();
		
		for(String s : plist) {
			System.out.println(s);
		}
		
		
		
	}

}
