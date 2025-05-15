package com.example.HRMDemo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.transaction.TransactionManager;

public class JobRepositoryImpl implements JobRepository {

	@Override
	public Job findById(long id) {
		// TODO Auto-generated method stub
		//Transaction instance 
		EntityTransaction transaction = null; 
		//try-catch to start transaction 
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			//Create Transaction 
			transaction = manager.getTransaction(); 
			//begin transaction 
			transaction.begin(); 
			//find by id 
			Job job = manager.find(Job.class, (Long)id); 
			//return the job 
			return job; 
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		return null;
	}

	@Override
	public List<Job> findAll() {
		//New List 
		List<Job> jobList = new ArrayList<Job>(); 
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		// try-catch to open a connection
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// Create Transaction
			transaction = manager.getTransaction(); 
			//Start transaction 
			transaction.begin(); 
			//Create query 
			Query query = manager.createNativeQuery("Select * from [HR_DB].[hr].[job]", Job.class);
			//add to list 
			jobList = query.getResultList(); 
			//return the list 
			if (jobList == null || jobList.isEmpty()) {
				jobList = new ArrayList<Job>(); 
			}
			return jobList; 
		} catch (Exception e) {
			System.out.println("No job found"); 
		}
		return null;
	}

	@Override
	public Job save(Job job) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = null;
		// Open a connection
		try (EntityManager entityManager = JpaUtil.getEntityManager()) {
			// Create a transaction
			entityTransaction = entityManager.getTransaction();
			// begin
			entityTransaction.begin();
			// save
			entityManager.persist(job);
			// commit = close cnn
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
