package com.sid.patient.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date dateNaissance;
	private boolean malade;

	public Patient() {

	}

	public Patient(Long id, String name, Date dateNaissance, boolean malade) {
		super();
		this.id = id;
		this.name = name;
		this.dateNaissance = dateNaissance;
		this.malade = malade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean isMalade() {
		return malade;
	}

	public void setMalade(boolean malade) {
		this.malade = malade;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", dateNaissance=" + dateNaissance + ", malade=" + malade + "]";
	}
	
	

}
