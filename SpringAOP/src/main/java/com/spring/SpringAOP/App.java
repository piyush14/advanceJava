package com.spring.SpringAOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.callback.ExampleBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
    	MethodClass ob_1 = (MethodClass) context.getBean("methodClass");   
    	ob_1.addInVectors();
    	ob_1.addInList();
    }
}
