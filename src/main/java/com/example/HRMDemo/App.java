package com.example.HRMDemo;

import com.example.HRMDemo.Job;
import java.math.BigDecimal;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// 1. Adding new job
//		Job job = new Job();
//		job.setJobTitle("NodeJS Developer");
//		job.setMaxSalary(new BigDecimal(5000));
//		job.setMinSalary(new BigDecimal(1500));

		JobRepository jobRepository = new JobRepositoryImpl();
//		System.out.println(jobRepository.save(job));
		// 2. Get all
//        List<Job> jobList = jobRepository.findAll(); 
//        //Display 
//        for (Job j : jobList) {
//        	//Display 
//        	System.out.println(j); 
//        }
		// 3. Find by id
//        long id = 1; 
//        //get by id 
//        Job j = jobRepository.findById(id); 
//        //display 
//        System.out.println(j); 
		// 4. find by name
//        String jobName = "Java"; 
//        //Get the list pf data by name 
//        List<Job> jobList = jobRepository.findByJobName(jobName); 
//        //Iterate  
//        for (Job j : jobList) {
//        	//Display 
//        	System.out.println(j); 
//        }
		//5. Delete a job 
		Job j = jobRepository.findById(3); 
		//delete 
		jobRepository.delete(j);   
		
	}
}
