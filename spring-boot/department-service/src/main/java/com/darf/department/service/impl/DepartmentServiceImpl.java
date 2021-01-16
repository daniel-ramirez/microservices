package com.darf.department.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darf.department.service.Department;
import com.darf.department.service.DepartmentRepository;
import com.darf.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department findById(Long id) {
		return departmentRepository.findById(id).orElseThrow();
	}
	
}
