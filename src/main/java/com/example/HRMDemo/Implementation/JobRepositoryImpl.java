package com.example.HRMDemo.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.HRMDemo.Entity.Job;
import com.example.HRMDemo.Repository.JobRepository;
import com.example.HRMDemo.Utility.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.TransactionManager;

public class JobRepositoryImpl implements JobRepository {

	public Job findObjectById(Long id) {
		// TODO Auto-generated method stub
		// Transaction instance
		EntityTransaction transaction = null;
		// try-catch to start transaction
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// Create Transaction
			transaction = manager.getTransaction();
			// begin transaction
			transaction.begin();
			// find by id
			Job job = manager.find(Job.class,id);
			// return the job
			return job;
			// close transaction
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public Optional<Job> findById(long id) {
		try (EntityManager entityManager = JpaUtil.getEntityManager()) {
			return Optional.ofNullable(entityManager.find(Job.class, id));
		}
	}

	@Override
	public List<Job> findAll() {
		// New List
		List<Job> jobList = new ArrayList<Job>();
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		// try-catch to open a connection
		try (EntityManager manager = JpaUtil.getEntityManager()) { // physical connection to DB
			// Create Transaction
			transaction = manager.getTransaction();
			// Start transaction
			transaction.begin();
//			// Create query
//			Query query = manager.createNativeQuery("Select * from [HR_DB].[hr].[job]", Job.class);
			// Using JPQL
			TypedQuery<Job> query = manager.createQuery("SELECT j FROM Job j", Job.class); // keyword viet hoa
			// add to
			jobList = query.getResultList();
			// return the list
			if (jobList == null || jobList.isEmpty()) {
				jobList = new ArrayList<Job>();
			}
			return jobList;
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
			throw new RuntimeException(); 
		}
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
			// commit = save changes to DB
			entityTransaction.commit();

			return job;
		} catch (Exception e) {
			if (entityTransaction != null && entityTransaction.isActive()) {
				System.out.println(e.getMessage());
			}
			throw new RuntimeException();
		}
	}

	@Override
	public boolean delete(Job job) {
		// TODO Auto-generated method stub
		// Transaction Definition
		EntityTransaction transaction = null;
		// try-catch to start transaction
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// Create transaction
			transaction = manager.getTransaction();
			// begin transaction
			transaction.begin();
			// check if job is not null
			if (job != null) {
				// Get job by id
				Job j = manager.find(Job.class, job.getId());
				// Check if found job is not null
				if (j != null)
					// Delete by id
					manager.remove(j);
				// commit to save changes on DB
				transaction.commit();
				// return stat
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean deleteByID(long id) {
		// Transaction definition
		EntityTransaction transaction = null;
		// try-catch to start transaction
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// Create transaction
			transaction = manager.getTransaction();
			// begin
			transaction.begin();
			// Identify jobRepoImpl object
			JobRepositoryImpl implement = new JobRepositoryImpl();
			// find Job by id
			Job job = implement.findById(id).get();
 			// Check if job is not null
			if (job != null) {
				// delete by job
				manager.remove(job);
			}
			// save changes to db
			transaction.commit();
			// return true
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<Job> findByJobName(String jobName) {
		// TODO Auto-generated method stub
		// Identify the new list
		List<Job> jobList = new ArrayList<Job>();
		// Transaction definition
		EntityTransaction transaction = null;
		// try-catch block to start transaction with entityManager
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// Create transaction
			transaction = manager.getTransaction();
			// begin transaction
			transaction.begin();
			// Identify the native query
//			Query query = manager.createNativeQuery("SELECT [id]\r\n"
//					+ "      ,[job_title]\r\n"
//					+ "      ,[max_salary]\r\n"
//					+ "      ,[min_salary]\r\n"
//					+ "  FROM [HR_DB].[hr].[job]\r\n"
//					+ "  where [job_title] like '%"+jobName+"%'", Job.class);   
			// Opt.2: Using JPQL (Should use)
			// JPQL: Jakarta Persistence Query Language
			// Select all = ko cần select
			// Truy vấn theo tên class và thuộc tính
			TypedQuery<Job> query = manager.createQuery("SELECT j from Job j where j.jobTitle like :constraint",
					Job.class);
			// Set param for constraint var ==> Reduce SQL Injection
			query.setParameter("constraint", (String) "%" + jobName + "%"); // wildcard
			// Get the result set based on the query
			jobList = query.getResultList();
			// return jobList
			return jobList;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(); 
		}
	}

	@Override
	public List<Job> findAll(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		// Identify the list
		List<Job> jobList = new ArrayList<Job>();
//		// Transaction def.
//		EntityTransaction transaction = null;
		// try-catch block to start transaction
		try (EntityManager manager = JpaUtil.getEntityManager()) {
			// JPQL Query get data from first index + 1 to firstResultIndex + size
			TypedQuery<Job> query = manager.createQuery("Select j from Job j", Job.class);
			// set first result
			query.setFirstResult((pageIndex - 1) * (pageSize));
			// set last result
			query.setMaxResults(pageSize);
			// get list
			jobList = query.getResultList();
			// return list
			return jobList;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(); 
		}
	}
	// phan trang: Load ban ghi tiep theo dua theo page

}
