package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Country;

public interface CountryRepository {
	//CRUD: 
	//Find by id 
	Optional<Country> findByID(Long id); 
	//find Object by ID (supplement)
	Country findCountryByID(Long id); 
	//find all
	List<Country> findAll(); 
	//save 
	Country save(Country country); 
	//delete 
	boolean delete(Country country); 
	//delete by id (supplement) 
	boolean deleteByID(Long id); 
	//find by Name 
	List<Country> findByName(String name); 
	//find all by pages 
	List<Country> findAll(int pageIndex, int pageSize); 
}
