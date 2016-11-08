package com.hierarchy.tableperclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="bike")
public class Bike extends Vehicle {
	
	@Column
	private double bike_cc;
	
	public Bike(String name,long price,double bike_cc){
		super(name,price);
		this.bike_cc = bike_cc;
	}

	public Bike(){
		
	}

	public double getBike_cc() {
		return bike_cc;
	}

	public void setBike_cc(double bike_cc) {
		this.bike_cc = bike_cc;
	}
	
	
}
