package com.example.UserAPIGetWay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserAPIGetWay.entity.NguoiDung;
import com.example.UserAPIGetWay.repository.NguoiDungRepository;
@Service
public class NguoiDungServiceImpl implements NguoiDungService {
	@Autowired
	private NguoiDungRepository nguoiDungRepository;
	@Override
	public List<NguoiDung> getAllUser(NguoiDung nguoiDung) {
		// TODO Auto-generated method stub
		return nguoiDungRepository.findAll();
	}

	@Override
	public NguoiDung saveUser(NguoiDung user) {
		// TODO Auto-generated method stub
		return nguoiDungRepository.save(user);
	}

}
