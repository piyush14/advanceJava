package com.spring.SpringDemo;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_File.xml");
//    	OrderBean ob[]  = new OrderBean()[2];
    	OrderBean ob_1 = (OrderBean) context.getBean("order_1");
    	OrderBean ob_2 = (OrderBean) context.getBean("order_2");
    	System.out.println(ob_1.getOrderName());
    	System.out.println(ob_1.getItem().getName() +" - " +ob_1.getItem().getPrice());
    	System.out.println(ob_2.getItem().getName() +" - " +ob_2.getItem().getPrice());
    	
    	System.out.println("total : "+ob_1.getItem().getPrice()+(int)ob_2.getItem().getPrice());

    	//Map list = ob.getItem().getItemList();
    	//System.out.println(ob.getItem().getItemList().containsKey("mobile"));
    		
    	
    }
}
