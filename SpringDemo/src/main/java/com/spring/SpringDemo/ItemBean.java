package com.spring.SpringDemo;

import java.util.Map;

public class ItemBean {
	private String name;
	private double price;
	private Map itemList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Map getItemList() {
		return itemList;
	}
	public void setItemList(Map itemList) {
		this.itemList = itemList;
	}
}
