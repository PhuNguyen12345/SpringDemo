package com.example.HRMDemo;
import com.example.HRMDemo.Job;
import java.math.BigDecimal;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//1. Adding new job 
//        Job job = new Job(); 
//        job.setJobTitle("Java Developer"); 
//        job.setMaxSalary(new BigDecimal(5000)); 
//        job.setMinSalary(new BigDecimal(1000)); 
        
        JobRepository jobRepository = new JobRepositoryImpl(); 
//        System.out.println(jobRepository.save(job)) ; 
        //2. Get all 
//        List<Job> jobList = jobRepository.findAll(); 
//        //Display 
//        for (Job j : jobList) {
//        	//Display 
//        	System.out.println(j); 
//        }
        //3. Find by id
        long id = 1; 
        //get by id 
        Job j = jobRepository.findById(id); 
        //display 
        System.out.println(j); 
    }
}
