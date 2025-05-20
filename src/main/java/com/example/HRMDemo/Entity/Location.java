package com.example.HRMDemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Entity notation 
@Entity
//table notation 
@Table(name = "location", schema = "hr")
//No-param constructor 
@NoArgsConstructor
//All-params construcotr 
@AllArgsConstructor
//Getter 
@Getter
//Setter 
@Setter
//equals() and hashcode() overloading annotation 
@EqualsAndHashCode
public class Location {
	// id annotation
	@Id
	// Generated Value annotation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// id
	private Long id;
	// Column def. annotation
	@Column(name = "street_address", columnDefinition = "NVARCHAR(255)", nullable = false)
	private String streetAddress;
	// postal_code def
	@Column(name = "postal_code", columnDefinition = "NVARCHAR(255)", nullable = false)
	private String postalCode;
	// city def
	@Column(name = "city", columnDefinition = "NVARCHAR(255)", nullable = false)
	private String city;
	// state_province def
	@Column(name = "state_province", columnDefinition = "NVARCHAR(255)", nullable = false)
	private String stateProvince;
	// country_id
	@ManyToOne
	@JoinColumn(name = "country_id") // default referenced id
	private Country country;

	// overloading toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + streetAddress + " - " + postalCode + " - " + city + " - " + stateProvince + " - " + country;
	}
}
