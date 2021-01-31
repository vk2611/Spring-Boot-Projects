package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Entity.Employee;
import com.example.Service.CRMService;

@Controller
public class CRMController {
	
	@Autowired
	private CRMService employeeservice;
	
	@GetMapping("/addEmployee")
	public String addEmployeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "addEmployee";
	}
	@GetMapping("/")
	public String getAllEmployee(Model m){
		m.addAttribute("employees",employeeservice.getAllEmployee());
		return "index";
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee")Employee e) {
		employeeservice.saveEmployee(e);
		return "redirect:/";
	}
	
	@RequestMapping(value="/updateEmployee/{id}")
	public ModelAndView UpdateEmployee(@PathVariable(name="id") int id) {
		ModelAndView m=new ModelAndView("addEmployee");
		Employee e=employeeservice.getEmployee(id);
		employeeservice.deleteEmployeeById(id);
		m.addObject(e);
		return m;
		
	}

	@RequestMapping(value="/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(name="id") int id) {
		employeeservice.deleteEmployeeById(id);
		return "redirect:/";
	}
	
}
