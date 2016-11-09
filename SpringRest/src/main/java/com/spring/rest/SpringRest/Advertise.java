package com.spring.rest.SpringRest;

import java.util.ArrayList;
import java.util.List;

public class Advertise {

	public Advertise(){
		
	}
	
	private List<String> categoryList = new ArrayList<String>();
	private String name;
	private String category;
	private String description;
	private String title;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private int photoCount;
	
	public Advertise(List<String> categoryList, String name, String category, String description, int photoCount) {
		super();
		this.categoryList = categoryList;
		this.name = name;
		this.category = category;
		this.description = description;
		this.photoCount = photoCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}
	
}
