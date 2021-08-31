# Springg


?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
 	http://www.springframework.org/schema/beans/spring-beans.xsd
 	http://www.springframework.org/schema/context
	http://www.springframework.org/schema/context/spring-context.xsd">

	1. VALUE AS ELEMENT
  		<bean class="com.springcore.Student" name="student1">
		<property name="Id">
			<value>1234</value>
		</property>

		<property name="studentName">
			<value>Sampada Kulkarni</value>
		</property>

		<property name="studentAddress">
			<value>Gulbarga</value>

			</property>
		</bean>

	</beans>

2.VALUE AS ATTRIBUTE
    		<property name="Id" value="1234" />
		
	
		<property name="studentName" value="Sampada Kulkarni" />
		

		<property name="studentAddress" value="Gulbarga" />
    
    
3.USING P SCHEMA
		<bean class="com.springcore.Student" name="student1"  p:Id="222"  p:studentName="sampada"  p:studentAddress="gulbarga"  />	
	












