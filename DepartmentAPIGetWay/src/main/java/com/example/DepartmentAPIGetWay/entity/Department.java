package com.example.DepartmentAPIGetWay.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department implements Serializable {
	@Id
	private String idDep;
	private String nameDep;
	private String adressDep;
	public String getIdDep() {
		return idDep;
	}
	public void setIdDep(String idDep) {
		this.idDep = idDep;
	}
	public String getNameDep() {
		return nameDep;
	}
	public void setNameDep(String nameDep) {
		this.nameDep = nameDep;
	}
	public String getAdressDep() {
		return adressDep;
	}
	public void setAdressDep(String adressDep) {
		this.adressDep = adressDep;
	}
	public Department(String idDep, String nameDep, String adressDep) {
		super();
		this.idDep = idDep;
		this.nameDep = nameDep;
		this.adressDep = adressDep;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [idDep=" + idDep + ", nameDep=" + nameDep + ", adressDep=" + adressDep + "]";
	}
	
}
