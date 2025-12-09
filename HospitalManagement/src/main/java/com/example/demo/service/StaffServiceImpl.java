package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffRepository;

	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffRepository.save(staff);
	}

	@Override
	public void deteleStaff(int id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
	}

	@Override
	public Staff getStaff(int id) {
		// TODO Auto-generated method stub
		Staff staff = staffRepository.findById(id).get();
		return staff;
	}

}
