package com.narendra.dao.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narendra.model.doctor.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	
}
