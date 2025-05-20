package com.example.HRMDemo.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Employee;
import com.example.HRMDemo.Repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmpById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
