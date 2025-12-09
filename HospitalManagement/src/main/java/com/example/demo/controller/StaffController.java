package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {

	@Autowired
	StaffService staffService;

	@PostMapping("add")
	public String addStaff(@RequestBody Staff staff) {
		staffService.saveStaff(staff);
		return "Staff added in Database";
	}

	@DeleteMapping("{id}")
	public String deleteStaff(@PathVariable int id) {
		staffService.deteleStaff(id);
		return "Staff Deleted";
	}

	@GetMapping("{id}")
	Staff getStaff(@PathVariable int id) {
		Staff staff = staffService.getStaff(id);
		return staff;

	}

}
