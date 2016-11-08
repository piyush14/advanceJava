package com.callback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringDemo.OrderBean;

public class ExampleBeanMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("CallBack.xml");
    	ExampleBean ob_1 = (ExampleBean) context.getBean("exampleBean");
	}

}
