package com.ibm.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // this will be treated as an aspect
@Component // register this object in the spring
public class AspectDemo {
	/*
	 * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)throws-pattern?)
	 */
	@Before("execution(* com.ibm.buisness.EmployeeService.*(..))")
	public void track1() {
		System.out.println("____ track1() is called _____");
	}

	@After("execution(* com.ibm.buisness.EmployeeService.*(..))")
	public void track2() {
		System.out.println("____ track2() is called _____");
	}
	
}
