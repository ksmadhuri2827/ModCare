
package com.modcare.patient_service.mappers;

import com.modcare.patient_service.dto.AddressDto;
import com.modcare.patient_service.dto.InsuranceDto;
import com.modcare.patient_service.dto.PatientDto;
import com.modcare.patient_service.dto.PatientEnrichedDto;
import com.modcare.patient_service.entities.Patient;

public class PatientMapper {
	
	public static PatientDto mapToPatientDto(Patient patientEntity) {
		if(patientEntity==null) {
			return null;
		}
		return new PatientDto(
				patientEntity.getPatientId(),
				patientEntity.getPatientName(),
				patientEntity.getPatientEmail(),
				patientEntity.getPatientPhone(),
				patientEntity.getPatientGender(),
				patientEntity.getPatient_dob()
			);
	}
	
	public static Patient mapToPatientEntity(PatientDto patientDto) {
		return new Patient(
				patientDto.getPatientId(),
				patientDto.getPatientName(),
				patientDto.getPatientEmail(),
				patientDto.getPatientPhone(),
				patientDto.getPatientGender(),
				patientDto.getPatient_dob()
			);
	}
	
	public static PatientEnrichedDto mapToPatientEnrichedDto(Patient patientEntity, AddressDto patientAddress, InsuranceDto patientInsurance) {
		return new PatientEnrichedDto(
				patientEntity.getPatientId(),
				patientEntity.getPatientName(),
				patientEntity.getPatientEmail(),
				patientEntity.getPatientPhone(),
				patientEntity.getPatientGender(),
				patientEntity.getPatient_dob(),
				patientAddress,
				patientInsurance
			);
	}
}
