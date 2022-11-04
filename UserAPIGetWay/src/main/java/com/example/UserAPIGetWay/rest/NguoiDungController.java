package com.example.UserAPIGetWay.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserAPIGetWay.entity.NguoiDung;
import com.example.UserAPIGetWay.service.NguoiDungServiceImpl;

@RestController
public class NguoiDungController {
	@Autowired
	private NguoiDungServiceImpl nguoiDungServiceImpl;
	@GetMapping("/users")
	public List<NguoiDung> getAllUser(NguoiDung nguoiDung) {
		return  nguoiDungServiceImpl.getAllUser(nguoiDung);
	}
	@PostMapping("/users")
	public NguoiDung saveUser(@RequestBody NguoiDung user) {
		// TODO Auto-generated method stub
		return nguoiDungServiceImpl.saveUser(user);
	}
}
