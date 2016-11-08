package com.hibernate.EmployeDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name="salaryOfAllEmployes",
			query="SELECT SUM(E.salary) FROM Employee E"),
//	
	@NamedQuery(name="employesOrderedBySal",
	query="FROM Employee E ORDER BY E.salary"),
	
	@NamedQuery(name="empBasedOnCity",
	query="select E.city from Employee E group by E.city"),
	
	@NamedQuery(name="avgSalOfEmp",
	query="SELECT AVG(E.salary) FROM Employee E"),
	
	@NamedQuery(name="salGt1000",
	query="FROM Employee E WHERE E.salary > 10000")
	
})



@Entity
@Table(name="EMPLOYEE_MASTER")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="p_id")
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="salary")
	private double salary;
	
	@Column(name="city")
	private String city;
	
	public Employee(String name, double salary,String city) {
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	public Employee(){
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return id + " - " + name + " - " + salary + " - "+city;
	}
}
