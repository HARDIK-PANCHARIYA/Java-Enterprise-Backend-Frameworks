package com.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.testcomponentscan.TestComponentScan;

@SpringBootApplication
@ComponentScan("com")  // ---- for making configure the core package
public class SpringBootProj189Application implements CommandLineRunner {
	
//with @Component anotation
//	@Autowired
//	Employee e;
	
//with @Bean anotation
//	@Autowired
//	Employee bean1;
	
	
	
//@Bean("b2")	 ----- identity
//	@Autowired
//	@Qualifier("b2")
//	Employee bean2;
	
	@Autowired
	@Qualifier("b3")
	Employee bean3;
	
//Present in other package --- using @ComponentScan("com") --- access here also	
//	@Autowired
//	TestComponentScan t1;  

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj189Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// with @Component anotation 
//		e.setEid(1);
//		e.setEname("Hardik");
//		e.setDptno(11);		
//		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDptno());
		
		
//-----------------------------------------------------------------------------------
		
		// @Bean
//		System.out.println(bean1.getEid()+" "+bean1.getEname()+" "+bean1.getDptno());
		

//-----------------------------------------------------------------------------------		
		
		
		//@Bean("b2")	 ----- identity
//		System.out.println(bean2.getEid()+" "+bean2.getEname()+" "+bean2.getDptno());
		
		System.out.println(bean3.getEid()+" "+bean3.getEname()+" "+bean3.getDptno());
		

//-----------------------------------------------------------------------------------		
		
		
		//Present in other package --- using @ComponentScan("com") --- access here also
//		t1.setSid(1);
//		t1.setSname("Hardik");
//		System.out.println(t1.getSid()+" "+t1.getSname());
		
		
		
		
		
		
		
	}

}
