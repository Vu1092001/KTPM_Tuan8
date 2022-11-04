package com.example.DepartmentAPIGetWay.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DepartmentAPIGetWay.entity.Department;
import com.example.DepartmentAPIGetWay.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;
	@GetMapping("/departments")
	public List<Department> getAllDepartment(Department dep){
		return departmentServiceImpl.getAllDepartment(dep);	
	}
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department dep) {
		return departmentServiceImpl.saveDepartment(dep);
	}
}
