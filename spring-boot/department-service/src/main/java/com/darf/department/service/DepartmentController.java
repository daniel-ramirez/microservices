package com.darf.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public List<Department> findAll() {
		log.info("Find all Department");
		return departmentService.findAll();
	}
	
	@PostMapping
	public Department save(@RequestBody Department department) {
		log.info("Save a Department");
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") Long id) {
		log.info("Find a Department by id");
		return departmentService.findById(id);
	}

}
