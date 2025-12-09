package com.example.demo.service;

import com.example.demo.entity.Staff;

public interface StaffService {

	void saveStaff(Staff staff);

	void deteleStaff(int id);

	Staff getStaff(int id);

}
