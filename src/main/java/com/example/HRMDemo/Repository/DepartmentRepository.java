package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Department;

public interface DepartmentRepository {
	//find by id 
	Optional<Department> findByID(Long id);  
	//find all 
	List<Department> findAll(); 
	//Save 
	Department save(Department department); 
	//delete 
	boolean delete(Department department); 
	//delete by id (supplement) 
	boolean deleteByID(Long id); 
	//findByName 
	List<Department> findByName(String name); 
	//findByAll 
	List<Department> findAll(int pageIndex, int pageSize); 
}
