package com.sid.patient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import java.util.Date;
import com.sid.patient.entities.Patient;
import com.sid.patient.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;*/


@SpringBootApplication
public class PatientApplication{
	/*
	 * @Autowired private PatientRepository patientRepository;
	 */
	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * patientRepository.save(new Patient(null,"marien",new Date(),false));
	 * patientRepository.save(new Patient(null,"amira",new Date(),false));
	 * patientRepository.save(new Patient(null,"ahmed",new Date(),true));
	 * patientRepository.save(new Patient(null,"amine",new Date(),false));
	 * 
	 * patientRepository.findAll().forEach(p->{System.out.println(p.getName());}); }
	 */
	
	
	
	

}
