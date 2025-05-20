package com.example.HRMDemo.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Department;
import com.example.HRMDemo.Repository.DepartmentRepository;

public class DepartmentRepositoryImpl implements DepartmentRepository {

	@Override
	public Optional<Department> findByID(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department save(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Department department) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByID(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
