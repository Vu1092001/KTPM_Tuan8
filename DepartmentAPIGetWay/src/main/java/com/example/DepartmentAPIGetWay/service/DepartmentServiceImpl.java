package com.example.DepartmentAPIGetWay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepartmentAPIGetWay.entity.Department;
import com.example.DepartmentAPIGetWay.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public List<Department> getAllDepartment(Department dep) {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department dep) {
		// TODO Auto-generated method stub
		return departmentRepository.save(dep);
	}

}
