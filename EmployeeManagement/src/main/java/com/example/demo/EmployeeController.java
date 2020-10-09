package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "home.jsp";
		
	}
	
	
	
	@RequestMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		
		repo.deleteById(id);
		
		
		
	} 

}
