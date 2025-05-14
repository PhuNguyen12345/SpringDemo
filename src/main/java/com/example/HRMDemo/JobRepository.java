package com.example.HRMDemo;

import java.util.List;

public interface JobRepository {
	Job findById(long id); 
	List<Job> findAll(); 
	Job save(Job job); 
	boolean delete(Job job); 
	List<Job> findByJobName(String jobName); 
	List<Job> findAll(int pageIndex, int pageSize); 
}
