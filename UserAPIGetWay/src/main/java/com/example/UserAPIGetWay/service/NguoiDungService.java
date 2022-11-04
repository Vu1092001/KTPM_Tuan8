package com.example.UserAPIGetWay.service;

import java.util.List;

import com.example.UserAPIGetWay.entity.NguoiDung;

public interface NguoiDungService {
	public List<NguoiDung> getAllUser(NguoiDung nguoiDung);
	public NguoiDung saveUser (NguoiDung user);
}
