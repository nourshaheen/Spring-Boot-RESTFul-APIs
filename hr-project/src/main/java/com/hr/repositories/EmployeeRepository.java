package com.hr.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hr.model.Employee;

@Repository
@Transactional
public interface EmployeeRepository  extends JpaRepository<Employee, Long>  ,JpaSpecificationExecutor<Employee>{

//	
//	List<Employee> findEmployeeByEmployeeNameStartingWith(String name); // fetch list of Employee which start with
//    List<Employee> findEmployeeByEmployeeRole(String role);         // fetch Employee by role
//    List<Employee> findAll();                           // fetch all Employee
	
}
