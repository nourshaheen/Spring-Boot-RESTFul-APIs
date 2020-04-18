package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Department;

import com.hr.services.DepartmentService;


@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptService ;
	
	@GetMapping("/departments")
	public List<Department> getAllDept (){	
		
		return deptService.getAllDepts();
	}

	@GetMapping("/getdeptbyid")
	public Department getDeptById (@RequestParam long id){
		
		return deptService.getDeptById(id);
	}

	
	
	
	@PostMapping("/departments")
	public String addDept (@RequestBody Department newDept) {
		
		deptService.addDept(newDept);
		
		return "saved successfully" ;
		
	}
	
	
	@PutMapping("/departments")
	public String updateDept (@RequestBody Department newDept) {
		
		deptService.updateDept(newDept);
		
		return "update successfully" ;
		
	}
	
	@DeleteMapping("/departments")
	public String deleteDept (@RequestParam long id) {
		deptService.deleteDept(id);
		return "Delete Successfully";
	}

}
