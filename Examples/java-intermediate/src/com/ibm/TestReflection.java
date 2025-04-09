package com.ibm;

import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.String");
			Method[] methods = c.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName());
			}
			System.out.println("_______________________________");
			c = Class.forName("java.util.Collection");
			methods = c.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
