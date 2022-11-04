package com.example.UserAPIGetWay.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "nguoidung")
public class NguoiDung implements Serializable {
	@Id
	private String idUser;
	private String nameUser;
	private String adddressUser;
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getAdddressUser() {
		return adddressUser;
	}
	public void setAdddressUser(String adddressUser) {
		this.adddressUser = adddressUser;
	}
	public NguoiDung(String idUser, String nameUser, String adddressUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.adddressUser = adddressUser;
	}
	public NguoiDung() {
		super();
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", adddressUser=" + adddressUser + "]";
	}
	
	
}
