package com.core.criteriaassigment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.core.criteriaassigment.entity.Employee;

public class ClientWhereSalaeyIsEmpty {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select Employee whose having salary is empty
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);
		
		c.add(Restrictions.isNull("salary"));
//		c.add(Restrictions.isEmpty("salary")); // not work only work on list and set 
		
		List<Employee> elist = c.list();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+" "+e.getEmpname());
		}

		
		
	}

}
