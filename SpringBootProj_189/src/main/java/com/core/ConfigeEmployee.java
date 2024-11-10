package com.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ConfigeEmployee {
	

//@Bean
//	public Employee getBean1() {
//		return new Employee(1,"bean1",101);
//	}
	
	
//@Qualifier("b1")
//	@Bean("b1")
//	public Employee getBean1() {
//		return new Employee(1,"bean1",101);
//	}
//	
//	@Bean("b2")
//	public Employee getBean2() {
//		return new Employee(2,"bean2",202);
//	}
//	
//	@Bean("b3")
//	public Employee getBean3() {
//		return new Employee(3,"bean3",303);
//	}
	
	
//
	@Bean("b1")
	@Lazy    //---- remove all instance only call particular
	public Employee getBean1() {
		System.out.println("First obj");
		return new Employee(1,"bean1",101);
	}
	
	@Bean("b2")
	@Lazy
	public Employee getBean2() {
		System.out.println("Second obj");
		return new Employee(2,"bean2",202);
	}
	
	@Bean("b3")
	@Lazy
	public Employee getBean3() {
		System.out.println("Third obj");
		return new Employee(3,"bean3",303);
	}


}
