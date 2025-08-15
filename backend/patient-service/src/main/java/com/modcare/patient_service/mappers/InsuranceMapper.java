package com.modcare.patient_service.mappers;


import com.modcare.patient_service.dto.InsuranceDto;
import com.modcare.patient_service.entities.Insurance;

public class InsuranceMapper {
	
	
	public static InsuranceDto mapToInsuranceDto(Insurance insuranceEntity) {
		
		if(insuranceEntity==null) {
			return null;
		}
		return new InsuranceDto(
				insuranceEntity.getInsuranceId(),
				insuranceEntity.getPatientId(),
				insuranceEntity.getProvider(),
				insuranceEntity.getPolicyNumber(),
				insuranceEntity.getCoverageType(),
				insuranceEntity.getExpiryDate()
			);
	}
	public static Insurance mapToInsuranceEntity(InsuranceDto insuranceDto) {
		if(insuranceDto==null) {
			return null;
		}
		return new Insurance(
				insuranceDto.getInsuranceId(),
				insuranceDto.getPatientId(),
				insuranceDto.getProvider(),
				insuranceDto.getPolicyNumber(),
				insuranceDto.getCoverageType(),
				insuranceDto.getExpiryDate()
				);
	}

}
