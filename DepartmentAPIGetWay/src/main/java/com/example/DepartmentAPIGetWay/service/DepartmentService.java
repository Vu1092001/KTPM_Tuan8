package com.example.DepartmentAPIGetWay.service;

import java.util.List;

import com.example.DepartmentAPIGetWay.entity.Department;

public interface DepartmentService {
	public List<Department> getAllDepartment (Department dep);
	public Department saveDepartment (Department dep);
}
