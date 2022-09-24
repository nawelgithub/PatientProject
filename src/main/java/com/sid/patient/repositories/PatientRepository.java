package com.sid.patient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.patient.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
