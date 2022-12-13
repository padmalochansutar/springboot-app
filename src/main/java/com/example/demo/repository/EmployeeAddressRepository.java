package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeAddress;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Serializable> {

}
