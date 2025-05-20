package com.example.HRMDemo.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 

//Entity notation 
@Entity 
//table def notation 
@Table(name = "department", schema = "hr") 
//No-params constructor 
@NoArgsConstructor
//All-params constructor 
@AllArgsConstructor
//Getter 
@Getter
//Setter 
@Setter
//Overloading equals() and hashcode() method 
@EqualsAndHashCode 
public class Department {
	//Id annptation 
	@Id
	//generated value 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//id 
	private Long id; 
	//Column department_name 
	@Column(name = "department_name", columnDefinition = "NVARCHAR(255)", nullable = false) 
	//department's name 
	private String departmentName; 
	//Column manager_id
	@ManyToOne 
	@JoinColumn(name = "manager_id") 
	private Employee manager; 
	@ManyToOne 
	@JoinColumn(name = "location_id") 
	private Location location; 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + departmentName + " - " + manager + " - " + location; 
	}
}
