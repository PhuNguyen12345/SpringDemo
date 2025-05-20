package com.example.HRMDemo.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Region;
import com.example.HRMDemo.Repository.RegionRepository;

public class RegionRepositoryImpl implements RegionRepository {

	@Override
	public Optional<Region> findByID(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Region save(Region region) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Region region) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByID(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Region> findByName(String regionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Region> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Region findRegByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
