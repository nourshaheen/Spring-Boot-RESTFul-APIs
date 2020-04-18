package com.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departments")
public class Department {
	@Id
	@Column(name = "department_id")
	private long id ;
	@Column(name = "department_Name")
	private String  departmentName ;
	@Column(name = "location_Id")
	private long locationId ;
	@Column(name = "manager_Id")
	private long managerId ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	public Department(long id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}
	public Department() {
		
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	} 
	
	
	

}
