package com.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Department;

import com.hr.repositories.DepartmentRepository;


@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptReps;

	public List<Department> getAllDepts() {

		return deptReps.findAll();
	}

	public Department getDeptById(long id) {

		return deptReps.findById(id).orElse(null);
	}

	public void addDept(Department newDept) {
		deptReps.save(newDept);
	}
	
	public void updateDept(Department newDept) {
		deptReps.save(newDept);
	}
	
	public void deleteDept (long id) {
		
		deptReps.deleteById(id);
	}
	
	

}
