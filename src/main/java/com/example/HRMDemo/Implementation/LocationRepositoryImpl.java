package com.example.HRMDemo.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Location;
import com.example.HRMDemo.Repository.LocationRepository;

public class LocationRepositoryImpl implements LocationRepository {

	@Override
	public Optional<Location> findByID(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location save(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByID(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Location> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
