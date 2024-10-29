package com.core.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.core.entityes.Products;

public class ClientWhereLessThan {
	
	public static void main(String[] args) {
	
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Products.class);
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	
	// select * from products where qty less than 200;
	
	@SuppressWarnings("deprecation")
	Criteria c = session.createCriteria(Products.class);
	
	c.add(Restrictions.lt("qty", 100));
	
	
	List<Products> plist = c.list();
	for(Products p : plist) {
		System.out.println(p.getPid()+" "+p.getPname()+" "+p.getQty());
	}
	
}

}
