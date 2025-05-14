package com.example.HRMDemo;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 

@Entity
@Table(name = "job", schema = "hr") 
@NoArgsConstructor //auto no param constructor 
@AllArgsConstructor // auto all-params constructor 
@Getter //auto getter 
@Setter //auto setter 
public class Job {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id long identity(1,1)  
	private Long id; 
	 
	@Column(name = "job_title", columnDefinition = "NVARCHAR(100)", nullable = false) //no null //(job_title NVARCHAR NOT NULL)
	private String jobTitle; 
	
	@Column(name = "max_salary", columnDefinition = "DECIMAL", precision = 14, scale = 2) //decimal(14,2) 
	private BigDecimal maxSalary; 
		
	@Column(name = "min_salary", columnDefinition = "DECIMAL" , precision = 14, scale = 2) 
	private BigDecimal minSalary;

	public Job(Long id, String jobTitle, BigDecimal maxSalary, BigDecimal minSalary) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
	}

	public Job() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public BigDecimal getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(BigDecimal maxSalary) {
		this.maxSalary = maxSalary;
	}

	public BigDecimal getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(BigDecimal minSalary) {
		this.minSalary = minSalary;
	}

	
	
	
}
