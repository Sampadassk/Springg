package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stereoo {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/streotype/stereoconfig.xml"); 
		Student student = con.getBean("obj",Student.class);
		//System.out.println(student);
		

}
}
