
package com.modcare.patient_service.entities;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "patient" )
public class Patient {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	private String patientName;
	private String patientEmail;
	private String patientPhone;
	private String patientGender;
	private String patient_dob;
	
	Patient(){}

	
	
	public Patient(Long patientId, String patientName, String patientEmail, String patientPhone, String patientGender, String patient_dob) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientEmail = patientEmail;
		this.patientPhone = patientPhone;
		this.patientGender = patientGender;
		this.patient_dob = patient_dob;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatient_dob() {
		return patient_dob;
	}

	public void setPatient_dob(String patient_dob) {
		this.patient_dob = patient_dob;
	}

}
