package com.example.HRMDemo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Job;

public interface JobRepository {
	Job findObjectById(Long id); 
	Optional<Job> findById(long id); 
	List<Job> findAll(); 
	Job save(Job job); 
	boolean delete(Job job); 
	List<Job> findByJobName(String jobName); 
	List<Job> findAll(int pageIndex, int pageSize); 
}
