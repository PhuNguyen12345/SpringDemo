package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Location;

public interface LocationRepository {
	//CRUD 
	//findByID
	Optional<Location> findByID(Long id);
	//findAll
	List<Location> findAll(); 
	//Save 
	Location save(Location location); 
	//delete 
	boolean delete(Location location); 
	//Delete by id (optional) 
	boolean deleteByID(Long id); 
	//Find by name 
	List<Location> findByName(String name); 
	//find All by pages 
	List<Location> findAll(int pageIndex, int pageSize); 
}
