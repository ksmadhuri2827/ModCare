package com.modcare.patient_service.dto;


public class PatientEnrichedDto {
	
	private Long patientId;
	private String patientName;
	private String patientEmail;
	private String patientPhone;
	private String patientGender;
	private String patient_dob;
	private AddressDto patient_address;
	private InsuranceDto patient_insurance;
	
	public PatientEnrichedDto() {}

	public PatientEnrichedDto(Long patientId, String patientName, String patientEmail, String patientPhone,
			String patientGender, String patient_dob, AddressDto patient_address, InsuranceDto patient_insurance) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientEmail = patientEmail;
		this.patientPhone = patientPhone;
		this.patientGender = patientGender;
		this.patient_dob = patient_dob;
		this.patient_address = patient_address;
		this.patient_insurance = patient_insurance;
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

	public AddressDto getPatient_address() {
		return patient_address;
	}

	public void setPatient_address(AddressDto patient_address) {
		this.patient_address = patient_address;
	}

	public InsuranceDto getPatient_insurance() {
		return patient_insurance;
	}

	public void setPatient_insurance(InsuranceDto patient_insurance) {
		this.patient_insurance = patient_insurance;
	}

	
	
}
