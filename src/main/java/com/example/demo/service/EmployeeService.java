package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeAddress;
import com.example.demo.repository.EmployeeAddressRepository;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
//there are three types of injection 1.setter injection 2.constructor injection 3.field injection
//field injection........
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;
	//rollback concept :-if one query select then middle time exception coming that time it will rollback to method no table insert afetr ...if all query executed successfully then insert the data in table otherwise exception coming.. 
	@Transactional(rollbackFor = Exception.class)//import org.springframework.transaction.annotation.Transactional;
public void saveData() {
		Employee employee=new Employee();
		employee.setEmpId(104);
		employee.setEmpName("reman");
		employee.setAge(17);
		employeeRepository.save(employee);
		
		int a=10/0;
		
		EmployeeAddress employeeAddress=new EmployeeAddress();
		employeeAddress.setEmpAddId(204);
		employeeAddress.setCity("rahama");
		employeeAddress.setState("odisha");
		employeeAddress.setEmpId(104);
		employeeAddressRepository.save(employeeAddress);
	}
}
