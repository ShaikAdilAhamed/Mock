package com.test.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer EId;
	
	private String EName;
	
	

	@OneToMany(mappedBy = "emp",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 private List<Department> Designation;
	 
	public Integer getEId() {
		return EId;
	}

	public void setEId(Integer eId) {
		EId = eId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public List<Department> getDesignation() {
		return Designation;
	}

	public void setDesignation(List<Department> designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", EName=" + EName +" ]";
	}

	
	
	

	
	
	
}
