package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.ProjectService;

@EnableAutoConfiguration
@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService ps;
	@PostMapping("/add")
	public User addUser(@RequestBody User u1) {
		return  ps.addUser(u1);
	}
	@GetMapping(value="/getById/{id}")
	public User getById(@PathVariable int id){
		return ps.getUserById(id);
	}
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return ps.getAllUser();
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return ps.deletById(id);
	}
	@GetMapping("/update")
	public User updateById(@RequestBody User u1) {
		return ps.updateById(u1);
	}
}
