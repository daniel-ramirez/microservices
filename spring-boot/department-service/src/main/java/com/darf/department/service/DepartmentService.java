package com.darf.department.service;

import java.util.List;

public interface DepartmentService {

	List<Department> findAll();

	Department save(Department department);

	Department findById(Long id);

}
