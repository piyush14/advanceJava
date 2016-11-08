package com.useroperations;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringAOP.MethodClass;

public class UserOperationMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
    	UserOperations ob_1 = (UserOperations) context.getBean("useroperation"); 
    	ob_1.register();
    	ob_1.login();

	}

}
