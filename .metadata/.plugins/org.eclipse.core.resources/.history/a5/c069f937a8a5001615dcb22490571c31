package com.useroperations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import com.useroperations.User;


@Aspect
public class UserHandlerAOP {

	@Pointcut("execution(* UserOperations.addUser(..))")
	public void pointcut_addUser(){}//pointcut name
	
	
	@Before("pointcut_addUser()")
	 public Object beforeAddUser(JoinPoint jp) throws Throwable { 
    	Object args[] = jp.getArgs();
    	System.out.println("before");
    	System.out.println("value " +args[0]);
        return new Object();
   }
}
