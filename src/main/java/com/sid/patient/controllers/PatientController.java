package com.sid.patient.controllers;

import javax.validation.Valid;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sid.patient.entities.Patient;
import com.sid.patient.repositories.PatientRepository;

@Controller
public class PatientController {

	@Autowired
	private PatientRepository patientRepository;

	@GetMapping(path = "/patients")
	public String list(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "4") int size,
			@RequestParam(name = "keyword", defaultValue = "") String mc) {

		Page<Patient> pagepatients = patientRepository.findByNameContains(mc, PageRequest.of(page, size));
		model.addAttribute("patients", pagepatients.getContent());
		model.addAttribute("pages", new int[pagepatients.getTotalPages()]);
		model.addAttribute("currentPage", page);
		model.addAttribute("keyword", mc);
		model.addAttribute("size", size);
		return "patients";
	}

	@GetMapping(path = "/deletePatient")
	public String delete(Long id, int page, int size, String keyword) {

		patientRepository.deleteById(id);
		return "redirect:/patients?page=" + page + "&size=" + size + "&keyword=" + keyword;
	}
	
	@GetMapping(path="/formPatient")
	public String formPatient(Model model) {
		model.addAttribute("patient",new Patient());
		model.addAttribute("mode", "new");
		return "formPatient";
	}
	
	@PostMapping("/savePatient")
	public String savePatient(@Valid Patient patient, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {return "formPatient";} 
		patientRepository.save(patient);
		model.addAttribute("patient",patient);
		return "confirmation";
	}
	
	@GetMapping(path="/editPatient")
	public String editPatient(Long id,Model model) {
		Patient p=patientRepository.findById(id).get();
		model.addAttribute("patient", p);
		model.addAttribute("mode", "edit");
		return"formPatient";
	}

}
