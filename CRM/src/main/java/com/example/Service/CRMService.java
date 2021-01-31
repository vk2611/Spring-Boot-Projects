package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.CRMRepository;

@Service
public class CRMService {
	
	@Autowired
	private CRMRepository EmployeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return EmployeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return EmployeeRepository.findAll();
	}

	public Employee updateDetails(int id) {
		return null; 
	}
	public Employee getEmployee(int id) {
		return EmployeeRepository.findById(id).orElse(null);
	}
	public void deleteEmployeeById(int id) {
		EmployeeRepository.deleteById(id);
	}

}
