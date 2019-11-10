package com.narendra.service.doctor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.narendra.dao.doctor.DoctorRepository;
import com.narendra.mailservice.EmailService;
import com.narendra.model.doctor.Doctor;

@Service
public class DoctorService {

	@Autowired
	private EmailService service;
	
	@Autowired
	private DoctorRepository repository;

	@PostConstruct
	public void initDoctor() {

		repository.saveAll(Stream.of(
				new Doctor(101, "John", "Cardiac"),
				new Doctor(102, "Peter", "eye")
				).collect(Collectors.toList()));
	}
	
	public List<Doctor> getDoctors() {
		service.sendEMail();
		return repository.findAll();
	}

}
