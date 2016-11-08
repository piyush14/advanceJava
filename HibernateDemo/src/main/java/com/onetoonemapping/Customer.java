package com.onetoonemapping;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	//private Enquiry enquiry;
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name="ENQUIRY_ID")
	private Enquiry enquiry;
	
	public Customer(){}
	public Customer(String name,Enquiry enquiry){
		//this.id = id;
		this.name= name;
		this.enquiry = enquiry;
	}
	
	public Enquiry getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
