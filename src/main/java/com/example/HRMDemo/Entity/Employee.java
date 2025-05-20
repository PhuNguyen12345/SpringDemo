package com.example.HRMDemo.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employee", schema = "hr")
@NoArgsConstructor // auto no param constructor
@AllArgsConstructor // auto all-params constructor
@Getter // auto getter
@Setter // auto setter
@EqualsAndHashCode
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", columnDefinition = "NVARCHAR(225)", nullable = false)
	private String firstName;
	@Column(name = "last_name", columnDefinition = "NVARCHAR(225)", nullable = false)
	private String lastName;
	@Column(name = "email", columnDefinition = "NVARCHAR(225)", nullable = false)
	private String email;
	@Column(name = "phone_number", columnDefinition = "NVARCHAR(225)", nullable = false)
	private String phoneNumber;
	@Column(name = "hire_date")
	private LocalDate hireDate;
	@ManyToOne
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;
	@Column(name = "salary")
	private BigDecimal salary;
	@Column(name = "commission_pct", columnDefinition = "NVARCHAR(225)", nullable = false)
	private String commissionPCT;
	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	private Employee manager;
	@ManyToOne 
	@JoinColumn(name = "department_id", referencedColumnName = "id") 
	private Department department; 
}
