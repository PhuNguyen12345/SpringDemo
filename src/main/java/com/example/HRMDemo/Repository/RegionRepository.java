package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Region;

public interface RegionRepository {
	//CRUD: 
	//Find by id
	Optional<Region> findByID(Long id); 
	//Find object by id (optional) 
	Region findRegByID(Long id); 
	//Find all 
	List<Region> findAll();  
	//Save 
	Region save(Region region); 
	//delete 
	boolean delete(Region region); 
	//Delete by ID (optional) 
	boolean deleteByID(Long id); 
	//Find by name 
	List<Region> findByName(String regionName); 
	//Find all by pages 
	List<Region> findAll(int pageIndex, int pageSize); 
}
