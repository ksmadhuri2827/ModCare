package com.modcare.patient_service.utils;

import com.modcare.patient_service.dto.InsuranceDto;

public class InsuranceValidation {
	
	public static boolean ValidateInsurance(InsuranceDto insuranceDto) {
		
		if(insuranceDto.getPatientId()==null) {
			return false;
		}
		if(insuranceDto.getProvider()==null) {
			return false;
		}
		if(insuranceDto.getPolicyNumber()==null) {
			return false;
		}
		if(insuranceDto.getCoverageType()==null) {
			return false;
		}
		if(insuranceDto.getExpiryDate()==null) {
			return false;
		}
		return true;
	}

}
