package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository pr;
	public User addUser(User u1) {
		return pr.save(u1);
	}
	public List<User> getAllUser() {
		return pr.findAll();
	}
	public User getUserById(int id) {
		return pr.findById(id).orElse(null);
	}
	public String deletById(int id) {
		pr.deleteById(id);
		return "Delete Item Successfully";
	}
	public User updateById(User u1) {
		User u2 = null;
		u2.setId(u1.getId());
		u2.setName(u1.getEmail());
		u2.setName(u1.getName());
		u2.setName(u1.getMobile());
		return pr.save(u2);
	}
}
