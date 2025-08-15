package com.modcare.patient_service.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modcare.patient_service.dto.InsuranceDto;
import com.modcare.patient_service.entities.Insurance;
import com.modcare.patient_service.mappers.InsuranceMapper;
import com.modcare.patient_service.repo.InsuranceRepo;
import com.modcare.patient_service.utils.InsuranceValidation;
import com.modcare.patient_service.utils.ErrorCodes;



@Service
public class InsuranceServiceImpl implements IInsuranceService {
	
	@Autowired
	InsuranceRepo insuranceRepo;
	public Object getByInsuranceId(Long insuranceId) {
		InsuranceDto insuranceDto=InsuranceMapper.mapToInsuranceDto(insuranceRepo.findById(insuranceId).orElse(null));
		if(insuranceDto==null) {
			return ErrorCodes.InsuranceNotFound;
		}
		return insuranceDto;
	}
	public Object createInsurance(InsuranceDto insuranceDto) {
		if(InsuranceValidation.ValidateInsurance(insuranceDto)) {
			Insurance insurance=InsuranceMapper.mapToInsuranceEntity(insuranceDto);
			InsuranceDto createdInsuranceDto=InsuranceMapper.mapToInsuranceDto(insuranceRepo.save(insurance));
			return createdInsuranceDto;
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
	}  
	public Object updateInsurance(InsuranceDto insuranceDto) {
		
		if(InsuranceValidation.ValidateInsurance(insuranceDto) && insuranceDto.getInsuranceId()!=null) {
			
			Insurance insurance=insuranceRepo.findById(insuranceDto.getInsuranceId()).orElse(null);
			if(insurance!=null) {
				insurance.setProvider(insuranceDto.getProvider());
				insurance.setPolicyNumber(insuranceDto.getPolicyNumber());
				insurance.setCoverageType(insuranceDto.getCoverageType());
				insurance.setExpiryDate(insuranceDto.getExpiryDate());
			}
			InsuranceDto updatedInsuranceDto=InsuranceMapper.mapToInsuranceDto(insuranceRepo.save(insurance));
			return updatedInsuranceDto;
			
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
		
	}
	public void deleteInsurance(Long insuranceId) {
		
		if(insuranceId==null) return;
		insuranceRepo.deleteById(insuranceId);
	}
	@Override
	public InsuranceDto getByPatientId(Long patientId) {
		List<Insurance> insuranceList = insuranceRepo.findByPatientId(patientId);
		if(insuranceList.size()<1) {
			return null;
		}
		return InsuranceMapper.mapToInsuranceDto(insuranceList.get(0));
	}

}
