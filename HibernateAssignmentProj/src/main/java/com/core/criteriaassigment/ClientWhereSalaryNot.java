package com.core.criteriaassigment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.core.criteriaassigment.entity.Employee;

public class ClientWhereSalaryNot {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select * from Employee whose salary is not equal to 50000
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);
		
		c.add(Restrictions.ne("salary", 50000));
		
//		c.add(Restrictions.eq("salary", 50000)); // equal to  50000
		
		List<Employee> elist = c.list();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
		}
		
		
	}

}
