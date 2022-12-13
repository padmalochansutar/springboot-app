package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Add_Tbl")
public class EmployeeAddress {
	@Id
	private Integer empAddId;
	
	private String city;
	
	private String state;
	
	private Integer empId;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getEmpAddId() {
		return empAddId;
	}

	public void setEmpAddId(Integer empAddId) {
		this.empAddId = empAddId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [empAddId=" + empAddId + ", city=" + city + ", state=" + state + ", empId=" + empId
				+ "]";
	}

	
	
	
	

}
