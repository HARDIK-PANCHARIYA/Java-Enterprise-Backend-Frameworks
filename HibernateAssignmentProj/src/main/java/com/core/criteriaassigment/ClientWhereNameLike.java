package com.core.criteriaassigment;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

import com.core.criteriaassigment.entity.Employee;

public class ClientWhereNameLike {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		// select * from employee where empname start with letter 'p' case sensitive
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);
		
//		c.add(Restrictions.like("empname", "p%"));  //not case sensitive
		c.add(Restrictions.sqlRestriction("BINARY empname like ?", "P%", StandardBasicTypes.STRING));
		
		
		List<Employee> elist = c.list();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
		}

	}

}
