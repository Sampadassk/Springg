package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);

	}

}
