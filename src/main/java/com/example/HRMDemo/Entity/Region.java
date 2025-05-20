package com.example.HRMDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*; 
//Annotation to define Entity 
@Entity 
//Annotation define physical table on DB 
@Table(name = "region", schema = "hr") 
//Annotation define no-param constructor 
@NoArgsConstructor
//Annotation define all-params constructor 
@AllArgsConstructor 
//Annotation define Getter 
@Getter
//Annotation define Setter 
@Setter 
//Annotation define overriding equals() and hashcode() for testing 
@EqualsAndHashCode

public class Region {
	//Annotation define id 
	@Id 
	//Annotation define value 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//Id 
	private Long id; 
	//Annotation define column 
	@Column(name = "region_name", columnDefinition = "NVARCHAR(255)", nullable = false) 
	//Define name 
	private String regionName; 
	
	//Overloading toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" - "+regionName;  
	}
}
