package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Employee;

public interface EmployeeRepository {
	Optional<Employee> findById(long id); 
	Employee findEmpById(long id); //Optional
	List<Employee> findAll(); 
	Employee save(Employee e); 
	boolean delete(Employee e); 
	List<Employee> findByFirstName(String firstName);  
	List<Employee> findByLastName(String lastName); 
	List<Employee> findAll(int pageIndex, int pageSize); 
}
