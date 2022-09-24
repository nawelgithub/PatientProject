package com.sid.patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sid.patient.entities.Patient;
import com.sid.patient.repositories.PatientRepository;

@Controller
public class PatientController {
     
	@Autowired
	private  PatientRepository patientRepository;
	
	
	@GetMapping(path="/patients")
	public String list(Model model) {
		
		List<Patient> patients = patientRepository.findAll();
		model.addAttribute("patients",patients);
		return "patients";
	}
	
	
}
