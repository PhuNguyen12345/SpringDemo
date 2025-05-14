package com.example.HRMDemo;
import com.example.HRMDemo.Job;
import java.math.BigDecimal;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Job job = new Job(); 
        job.setJobTitle("Java Developer"); 
        job.setMaxSalary(new BigDecimal(5000)); 
        job.setMinSalary(new BigDecimal(1000)); 
        
        JobRepository jobRepository = new JobRepositoryImpl(); 
        System.out.println(jobRepository.save(job)) ;
    }
}
