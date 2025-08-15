package com.modcare.patient_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modcare.patient_service.dto.PatientDto;
import com.modcare.patient_service.service.IPatientService;
import com.modcare.patient_service.utils.HelperFunctions;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	@Autowired
	IPatientService patientService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getByPatientId(@PathVariable("id") Long id){
		Object resultDto = patientService.getByPatientId(id);
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@PostMapping()
	public ResponseEntity<?> createPatient(@RequestBody PatientDto patientDto){
		Object resultDto = patientService.createPatient(patientDto);
		if(resultDto instanceof PatientDto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(resultDto);
			
		}
		return HelperFunctions.getResponseEntity(resultDto);
	}
	@PutMapping()
	public ResponseEntity<?> updatePatient(@RequestBody PatientDto patientDto){
		Object updatedResultDto=patientService.updatePatient(patientDto);
		return HelperFunctions.getResponseEntity(updatedResultDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable("id") Long id){
		patientService.deletePatientById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}

	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> getByPatientId(@PathVariable("id") Long id){
//		PatientEnrichedDto resultDto = (PatientEnrichedDto) patientService.getByPatientId(id);
//		if(resultDto == null) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found!");
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(resultDto);
//	}
	
	
}
