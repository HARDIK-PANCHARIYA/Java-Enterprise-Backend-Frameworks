package com.core.criteriaassigment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.core.criteriaassigment.entity.Employee;

public class ClientWhereDeptnoAndSalary {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select * from employee having deptno=30 and salary is greater than 45000
		
		Criteria c = session.createCriteria(Employee.class);
				
		c.add(Restrictions.and(
				Restrictions.eq("deptno",30),
				Restrictions.ge("salary", 45000)));
		
		List<Employee> elist = c.list();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getDeptno()+" "+e.getSalary());
		}
		
	}

}
