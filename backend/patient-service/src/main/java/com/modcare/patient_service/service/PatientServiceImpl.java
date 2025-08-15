package com.modcare.patient_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modcare.patient_service.dto.AddressDto;
import com.modcare.patient_service.dto.InsuranceDto;
import com.modcare.patient_service.dto.PatientDto;
import com.modcare.patient_service.entities.Patient;
import com.modcare.patient_service.mappers.PatientMapper;
import com.modcare.patient_service.repo.PatientRepo;
import com.modcare.patient_service.utils.ErrorCodes;
import com.modcare.patient_service.utils.PatientValidation;

import jakarta.transaction.Transactional;

@Service
public class PatientServiceImpl implements IPatientService {
	
	@Autowired
	PatientRepo patientRepo;
	@Autowired
	IAddressService addressService;
	@Autowired
	IInsuranceService insuranceService;
	
	public Object getByPatientId(Long patientId)
	{
		Patient patient = patientRepo.findById(patientId).orElse(null);
		if(patient == null) {
			return ErrorCodes.PatientNotFound;
		}
		AddressDto addressDto = addressService.getByUserId(patient.getPatientId());
		InsuranceDto insuranceDto = insuranceService.getByPatientId(patientId);
		return PatientMapper.mapToPatientEnrichedDto(patient, addressDto, insuranceDto);
	}
	
	@Transactional
	public Object createPatient(PatientDto patientDto) {
		
		if(PatientValidation.validatePatientDto(patientDto)) {
			Patient patient = PatientMapper.mapToPatientEntity(patientDto);
			PatientDto createdPatientDto = PatientMapper.mapToPatientDto(patientRepo.save(patient));
			return createdPatientDto;
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
	}
	public Object updatePatient(PatientDto patientDto) {
		if(PatientValidation.validatePatientDto(patientDto) && patientDto.getPatientId() != null ) {
			Patient patient = patientRepo.findById(patientDto.getPatientId()).orElse(null);
			if(patient != null) {
				patient.setPatientPhone(patientDto.getPatientPhone());
			}
			PatientDto updatedPatientDto=PatientMapper.mapToPatientDto(patientRepo.save(patient));
			return updatedPatientDto;
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
	}
	public void deletePatientById(Long patientId) {
		if(patientId==null) return;
        patientRepo.deleteById(patientId);
		
	}

}
