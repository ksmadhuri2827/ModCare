package com.modcare.patient_service.utils;

import com.modcare.patient_service.dto.PatientDto;

public class PatientValidation {
	
	public static boolean validatePatientDto(PatientDto patientdto){
		
		if(patientdto.getPatientName()==null) {
			return false;
		}
		if(patientdto.getPatientEmail()==null) {
			return false;
		}
		
		return true;
	}
	
	

}
