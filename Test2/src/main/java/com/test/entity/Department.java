package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer DId;
	
	private String DName;
	
	private String Location;
	
	@ManyToOne
	@JoinColumn(name = "EId")
	private Employee emp;

	public Integer getDId() {
		return DId;
	}

	public void setDId(Integer dId) {
		DId = dId;
	}

	public String getDName() {
		return DName;
	}

	public void setDName(String dName) {
		DName = dName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	
}
