package com.spring.SpringDemo;

public class OrderBean {

	private ItemBean item;
	private String orderName;
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public ItemBean getItem() {
		return item;
	}

	public void setItem(ItemBean item) {
		this.item = item;
	}
}
