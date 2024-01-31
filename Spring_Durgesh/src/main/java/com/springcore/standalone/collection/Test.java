package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		Person person1=(Person) context.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFeestructure());
		System.out.println("-----------------");
		System.out.println(person1.getProperties());
		System.out.println(person1.hashCode());
		
		Teacher t1=(Teacher) context.getBean("teacher");
		Teacher t2=(Teacher) context.getBean("teacher");
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
