package com.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.error.RecordNotFoundException;
import com.hr.model.Employee;
import com.hr.repositories.EmployeeRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;


@Service
public class EmployeesService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> findByCriteria(String employeeName){
        return employeeRepository.findAll(new Specification<Employee>() {
            public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(employeeName!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("employeeName"), employeeName)));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }
	
	
//	public List<Employee> getDeptEmps (long deptId){
//		
//	return	employeeRepository.findByDepartmentId(deptId);	
//		
//	}
//
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	public Employee getEmpById(long id) {

		return employeeRepository.findById(id).orElseThrow(()->  new RecordNotFoundException("this employee not found :- " + id ));
	}

//	public List<Employee> getEmpByFirstName(String firstName) {
//
//		return employeeRepository.findByfirstNameIgnoreCase(firstName);
//	}
//
//	public List<Employee> getEmpSearch(String firstName, String lastName) {
//
//		return employeeRepository.empSearch(firstName, lastName);
//	}

	public void addEmp(Employee newEmp) {
		employeeRepository.save(newEmp);
	}
	
	public void aupdateEmp(Employee newEmp) {
		employeeRepository.save(newEmp);
	}
	
	public void deleteEmp (long id) {
		
		employeeRepository.deleteById(id);
	}
}
