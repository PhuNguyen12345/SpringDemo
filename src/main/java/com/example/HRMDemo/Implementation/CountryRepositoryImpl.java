package com.example.HRMDemo.Implementation;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Country;
import com.example.HRMDemo.Repository.CountryRepository;

public class CountryRepositoryImpl implements CountryRepository {

	@Override
	public Optional<Country> findByID(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Country findCountryByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country save(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Country country) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByID(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Country> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
