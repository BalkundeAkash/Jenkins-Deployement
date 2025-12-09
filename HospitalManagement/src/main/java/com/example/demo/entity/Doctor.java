package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor-9-Dec")
public class Doctor {

	@Id
	private int id;
	
	private String name;
	private String address;
	private String spl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpl() {
		return spl;
	}

	public void setSpl(String spl) {
		this.spl = spl;
	}
	
	
}
