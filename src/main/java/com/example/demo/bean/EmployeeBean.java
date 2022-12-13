package com.example.demo.bean;

public class EmployeeBean {
private Integer empId;
	
	private String empName;
	
	private Integer age;
//(HIS-212)
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public EmployeeBean(Integer empId, String empName, Integer age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}


}
