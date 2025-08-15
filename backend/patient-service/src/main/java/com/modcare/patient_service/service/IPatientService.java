package com.modcare.patient_service.service;

import com.modcare.patient_service.dto.PatientDto;
import com.modcare.patient_service.dto.PatientEnrichedDto;

public interface IPatientService {
	
	public Object getByPatientId(Long patientId);
	public Object createPatient(PatientDto patientdto);
	public Object updatePatient(PatientDto patientdto);
	public void deletePatientById(Long patientId);
	

}
