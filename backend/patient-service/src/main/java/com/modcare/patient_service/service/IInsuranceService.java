package com.modcare.patient_service.service;

import com.modcare.patient_service.dto.InsuranceDto;

public interface IInsuranceService{
	
	public Object getByInsuranceId(Long insuranceId);
	public InsuranceDto getByPatientId(Long patientId);
	public Object createInsurance(InsuranceDto insuranceDto);
	public Object updateInsurance(InsuranceDto insuranceDto);
	public void deleteInsurance(Long insuranceId);

}
