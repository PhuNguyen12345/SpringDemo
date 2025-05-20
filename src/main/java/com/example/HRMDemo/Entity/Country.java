package com.example.HRMDemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Entity annotation 
@Entity
//Table annotation 
@Table(name = "country", schema = "hr")
//No-param constructor annotation 
@NoArgsConstructor
//All-params constructor annotation 
@AllArgsConstructor
//Getter annotation 
@Getter
//Setter annotation 
@Setter
//equals()/hashcode() overloading annotation 
@EqualsAndHashCode
public class Country {
	// id annotation
	@Id
	// Generated value anno
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Id
	private Long id;
	// column annotation
	@Column(name = "country_name", columnDefinition = "NVARCHAR(255)", nullable = false)
	// name
	private String countryName;
	// Many-to-One annotation
	@ManyToOne
	// join by region_id
	@JoinColumn(name = "region_id", referencedColumnName = "id")
	// Another way: @JoinColumn(name = "region_id") (id is defalt referenced)
	// identify region by id
	private Region region;

	// Overloading toString() for easier testing
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + countryName + " - " + region;
	}
}
