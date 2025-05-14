package com.example.HRMDemo;
import jakarta.persistence.*; 
public class JpaUtil {
	public static EntityManager getEntityManager() {
		//setting new connection to DB 
		return Persistence.createEntityManagerFactory("hrPU").createEntityManager(); 
		
	}
}
