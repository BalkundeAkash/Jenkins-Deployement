package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
/*
 * 
 * JpaRepository is an interface which provides the
 *  some abstract methods like
 * save delete update get
 * 
 */