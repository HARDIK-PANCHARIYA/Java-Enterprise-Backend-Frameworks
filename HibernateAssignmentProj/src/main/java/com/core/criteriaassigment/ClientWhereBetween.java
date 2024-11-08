package com.core.criteriaassigment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.core.criteriaassigment.entity.Employee;


public class ClientWhereBetween {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		// select * from products where salary in between 30000 and 40000;
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);
		
		c.add(Restrictions.between("salary", 20000, 40000));
		
		
		List<Employee> elist = c.list();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
		}
		
	}

}
