package com.useroperations;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringAOP.MethodClass;

public class UserOperationMain {
	 static AbstractApplicationContext context;

	    public static void main(String[] args) {

	        context = new ClassPathXmlApplicationContext("aop.xml");

	        printCharoom("linux_room");
	        printCharoom("android_room");

	        context.close();
	        context.registerShutdownHook();
	    }

	    public static void printCharoom(String name) {
	        System.out.println("Chatroom : " + name);
	        Chatroom chatroom = (Chatroom) context.getBean(name);
	        chatroom.getUserList().forEach(System.out::println);
	        chatroom.getMessageList().forEach(System.out::println);
	    }

}
