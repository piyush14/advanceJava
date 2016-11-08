package com.spring.SpringAOP;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MethodClass {
	
	
	public void show(){
		System.out.println("MethodClass called");
	}
	
	public void addInVectors(){
		Vector <Integer> v = new Vector<Integer>();
		
		for(int i=0;i<1000;i++){
			v.add(i,i);
		}
		System.out.println("Elements added to vector");
	}
	
	public void addInList(){
		ArrayList<Integer> al=new ArrayList<Integer>();	
		for(int i=0;i<1000;i++){
			al.add(i,i);
		}
		System.out.println("Elements added to list");
	}
}
