package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Employee;

@Repository
public interface CRMRepository extends JpaRepository<Employee,Integer>{
	
}
