package com.hr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	

}

/*
 * @Mapper public interface DepartmentMapper {
 * 
 * @Select("select department_id , department_Name  from departments")
 * 
 * @Results(value = {
 * 
 * @Result(property = "id" , column = "department_id"),
 * 
 * @Result(property = "departmentName" , column = "department_Name"), }) public
 * List<Department> getAll () ;
 * 
 * @Select("select department_id , department_Name  from departments where department_id = #{deptId}"
 * )
 * 
 * @Results(value = {
 * 
 * @Result(property = "id" , column = "department_id"),
 * 
 * @Result(property = "departmentName" , column = "department_Name"), })
 * Department getDeptById (long deptId);
 * 
 * @Insert("INSERT INTO departments ( department_id, department_name, manager_id , location_id) VALUES (  #{id} , #{departmentName}, #{managerId}, #{locationId})"
 * ) void insert (Department dept);
 * 
 * @Update("UPDATE departments SET    department_name = #{departmentName}  , manager_id = #{managerId} , location_id = #{locationId}  WHERE     department_id =#{id}"
 * ) void update (Department dept);
 * 
 * @Delete("DELETE FROM departments WHERE    department_id = #{deptId}") void
 * delete (long deptId);
 * 
 * 
 * }
 */