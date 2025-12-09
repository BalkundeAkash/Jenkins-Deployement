package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@PostMapping("add")
	public String saveDoctor(@RequestBody Doctor doctor) {
		doctorService.saveDoctor(doctor);
		return "Doctor in Database";
	}

	@DeleteMapping("/{id}")
	public String deteleDoctor(@PathVariable int id) {
		doctorService.deleteDoctor(id);
		return "Doctor Deleted";
	}

	@GetMapping("{id}")
	Doctor getDoctor(@PathVariable int id) {

		Doctor doctor = doctorService.getDoctor(id);

		return doctor;
	}

}
