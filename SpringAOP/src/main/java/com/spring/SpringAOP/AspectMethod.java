package com.spring.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectMethod {

	static long startTime;
	static long endTime;
	@Pointcut("execution(* MethodClass.addInVectors(..))")
	public void pointcut_addInVectors(){}//pointcut name
	
	
	@Pointcut("execution(* MethodClass.addInList(..))")
	public void pointcut_addInList(){}//pointcut name
	
	
	@Before("pointcut_addInVectors()")
	public void beforeAddInVectors(){
		System.out.println("before called of vector");
		startTime = System.currentTimeMillis();
		
	}
	
	@After("pointcut_addInVectors()")
	public void afterAddInVectors(){
		System.out.println("after called of vector");
		endTime = System.currentTimeMillis();
		System.out.println("Total time lapsed : "+ (endTime - startTime));
		
	}
	
	@Before("pointcut_addInList()")
	public void beforeAddInList(){
		//startTime = 0;
		System.out.println("before called of list");
		startTime = System.currentTimeMillis();
	}
	
	@After("pointcut_addInList()")
	public void afterAddInList(){
		System.out.println("after called of list");
		endTime = System.currentTimeMillis();
		System.out.println("Total time lapsed : "+ (endTime - startTime));
	}
	
	
}
