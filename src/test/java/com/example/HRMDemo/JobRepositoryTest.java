package com.example.HRMDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.HRMDemo.Entity.Job;
import com.example.HRMDemo.Implementation.JobRepositoryImpl;
import com.example.HRMDemo.Repository.JobRepository;

class JobRepositoryTest {
	JobRepository jobRepository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		jobRepository = new JobRepositoryImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindObjectById() {
		Long id = 1l;
		// define job by id
		Job actual = jobRepository.findObjectById(id);
		// Set expected object
		Job expected = new Job();
		// set id
		expected.setId(1l);
		// set title
		expected.setJobTitle("Java Developer");
		// set max salary
		expected.setMaxSalary(new BigDecimal(5000));
		// set min salary
		expected.setMinSalary(new BigDecimal(1000));

		// set equals
		assertEquals(expected, actual);

	}

	@Test
	void testFindById() {
		// Test case 1
		Long id = 1l;
		Optional<Job> actual = jobRepository.findById(id);

		// Expected result
		Job expected = new Job();
		expected.setId(1l);
		expected.setJobTitle("Java Developer");
		expected.setMaxSalary(new BigDecimal(5000));
		expected.setMinSalary(new BigDecimal(1000));

		assertEquals(expected, actual.get());
	}

	@Test
	void testFindAll() {
		// Idenify the size
		int size = 23;
		// get the list of all job
		List<Job> jobList = jobRepository.findAll();
		// printout List
		System.out.println(jobList);
		// assertEquals by size
		assertEquals(size, jobList.size());
	}

	@Test
	void testSave() {
		// Identify the job to add
		Job expected = new Job();
		// set the id
		expected.setId(25l);
		// set the title
		expected.setJobTitle("FullStack Developer");
		// set the max salary
		expected.setMaxSalary(new BigDecimal(7400));
		// set the min salary
		expected.setMinSalary(new BigDecimal(3200));
		// save job
		Job jobToSave = new Job();
		// set the title
		jobToSave.setJobTitle("FullStack Developer");
		// set the max salary
		jobToSave.setMaxSalary(new BigDecimal(7400));
		// set the min salary
		jobToSave.setMinSalary(new BigDecimal(3200)); 
		// save and get the job
		Job savedJob = jobRepository.save(jobToSave);
		// assert equals by job and savedJob
		assertEquals(expected, savedJob);
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteByID() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByJobName() {
		// Identify jobName / jobTtile
		String jobTitle = "Java";
		// find job by title
		List<Job> actual = jobRepository.findByJobName(jobTitle);
		// find expectedSize
		int expectedSize = 3;
		// assertion by size
		assertEquals(expectedSize, actual.size());
	}

	@Test
	void testFindAllIntInt() {
		int pageIndex = 1;
		int pageSize = 21;
		// Get list of users by index and size
		List<Job> jobList = jobRepository.findAll(pageIndex, pageSize);
		// Display
		System.out.println(jobList);
		// assert equals size
		assertEquals(pageSize, jobList.size());
	}

}
