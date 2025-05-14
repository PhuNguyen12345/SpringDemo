package com.example.HRMDemo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.TransactionManager;

public class JobRepositoryImpl implements JobRepository {

	@Override
	public Job findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job save(Job job) {
		// TODO Auto-generated method stub
	EntityTransaction entityTransaction = null; 
		//Open a connection 
		try (EntityManager entityManager = JpaUtil.getEntityManager()) {
			//Create a transaction 
			entityTransaction = entityManager.getTransaction();
			//begin 
			entityTransaction.begin(); 
			//save 
			entityManager.persist(job);
			//commit = close cnn
			entityTransaction.commit(); 
			
			return job; 
		} catch (Exception e) {
			if (entityTransaction != null && entityTransaction.isActive()) {
				
			}
		}
		return null;
	}

	@Override
	public boolean delete(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Job> findByJobName(String jobName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
