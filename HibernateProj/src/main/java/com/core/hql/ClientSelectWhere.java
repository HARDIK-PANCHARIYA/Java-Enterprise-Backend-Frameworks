package com.core.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.core.entityes.Products;

public class ClientSelectWhere {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select category from product

		Query query = session.createQuery("select pname, category from Products where price >=:c");
		query.setParameter("c", 10000);

		List<Object[]> plist = query.list();

		for (Object[] p1 : plist) {
			
			for(Object o : p1) {
				System.out.print(o+" ");
			}
			System.out.println();
		}

	}

}
