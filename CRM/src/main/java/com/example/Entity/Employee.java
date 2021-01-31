package com.example.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String FirstName;
	
	private String LastName;
	
	private String Email;
	
	private String PhoneNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, String email, String phoneNo) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNo = phoneNo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	
}