package com.hr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.services.EmployeesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")

@Api(value="employee", description="Operations for employee service" )
public class EmployeesController {

	
	@Autowired
	private EmployeesService empService ;
	
//	@GetMapping("/departments/{deptId}/employees")
//	public List<Employee> getDeptEmps (@PathVariable long deptId ){	
//		
//		return empService.getDeptEmps(deptId);
//	}
//	
	@GetMapping("/employees")
	@ApiOperation(value = "View a list of available Employee", response = Employee.class)
	@ApiResponses(value = {

	        @ApiResponse(code = 200, message = "Successfully retrieved list"),

	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),

	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")

	})	
	public List<Employee> getAllEmployees (){	
		return empService.getAllEmployees() ;
	}

	@GetMapping("/getempbyid")
	public Employee getEmpById (@RequestParam long id){
		
		
		
		return empService.getEmpById(id);
	}

	
//	@GetMapping("/getempbyname")
//	public List<Employee> getEmpByFirstName (@RequestParam String firstName){
//		
//		
//		
//		return empService.getEmpByFirstName(firstName);
//	}
//	
//	
//	@GetMapping("/empsearch")
//	public List<Employee> empSearch (@RequestParam String firstName , @RequestParam String lastName){
//		
//		
//		
//		return empService.getEmpSearch(firstName, lastName);
//	}
//	
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmp (@Valid @RequestBody Employee newEmp) {
	
		empService.addEmp(newEmp);
		
		return new ResponseEntity<Employee> (newEmp , HttpStatus.OK) ;
		
	}
	
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmp (@Valid @RequestBody Employee newEmp) {
		
		empService.aupdateEmp(newEmp);
		
		return new ResponseEntity<Employee> (newEmp , HttpStatus.OK) ;
		
	}
	
	@DeleteMapping("/employees")
	public String deleteEmp (@RequestParam long id) {
		empService.deleteEmp(id);
		return "Delete Successfully";
	}
	
}
