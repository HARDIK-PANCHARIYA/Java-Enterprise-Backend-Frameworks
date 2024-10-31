package com.core.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.core.entityes.Products;

public class ClientSelectAllcolumnWhere {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select category from product

		Query query = session.createQuery("from Products where category =:c");
		query.setParameter("c", "Stationary");

		List<Products> plist = query.list();

		for (Products p1 : plist) {
			System.out.println(p1);
		}

	}

}
