package com.ibm;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer {
	public static void main(String[] args) {
		// initialize the spring container using BeanFactory or ApplicationContext
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		
		Locations location = (Locations)factory.getBean("b3");
		List<String> cities = location.getCities();
		System.out.println(cities);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)factory;
		ctx.close();
		
	}
}
