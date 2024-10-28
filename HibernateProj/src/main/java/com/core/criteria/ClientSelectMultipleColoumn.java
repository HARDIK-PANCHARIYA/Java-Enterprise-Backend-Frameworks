package com.core.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.core.entityes.Products;

public class ClientSelectMultipleColoumn {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select pname,price,qty from products
		
		Criteria c = session.createCriteria(Products.class);
		
		// select pname,price,qty from product
		
		Projection p1 = Projections.property("pname");
		Projection p2 = Projections.property("price");
		Projection p3 = Projections.property("qty");
		
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		c.setProjection(plist);
		
		List<Object []> list = c.list();
		
		for(Object[] s : list) {
			for(Object b : s) {
				System.out.print(b.toString()+" ");
			}
			System.out.println();
		}
		
	}

}
