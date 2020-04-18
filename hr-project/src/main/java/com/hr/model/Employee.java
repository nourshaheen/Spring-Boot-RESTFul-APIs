package com.hr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	@ApiModelProperty(notes = "The database generated Employee ID")
	@Column(name = "employee_id")
	private Long employeeId ; 	
	@Column(name = "first_Name")
	@ApiModelProperty(notes = "The First Name of the Employee", required = true)
	@NotEmpty(message = "First Name must not be empty")
	private String firstName ;
	@Column(name = "last_Name")
	private String lastName ;
	@NotNull(message = "Salary must not be empty")
	private Double salary ;	
	@Column(name = "PHONE_NUMBER" , unique = true)	
	@Min(value = 11 , message = "phone number should be 11 number")
	private String phoneNum;
	@Column(name = "HIRE_DATE")
	private Date hireDate ;
	@Column (name = "JOB_ID") 
	private String jobId ;
	@Column(name = "COMMISSION_PCT")
	private Double commPct ;
	@Column(name = "MANAGER_ID")
	private Long managerId ;
	@Column(name = "DEPARTMENT_ID")
	private Long departmentId ;
	@Column(name = "Email")
	@Email(message = "you should enter a vaild email")
	private String email ; 
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Double getCommPct() {
		return commPct;
	}
	public void setCommPct(Double commPct) {
		this.commPct = commPct;
	}
	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
}
