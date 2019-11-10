package com.narendra.controller.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.model.doctor.Doctor;
import com.narendra.service.doctor.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctors() {
		return service.getDoctors();
	}
}
