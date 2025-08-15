package com.modcare.patient_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modcare.patient_service.dto.InsuranceDto;
import com.modcare.patient_service.service.InsuranceServiceImpl;
import com.modcare.patient_service.utils.HelperFunctions;

@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {
	
	@Autowired
	InsuranceServiceImpl insuranceServiceImpl;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getInsuranceById(@PathVariable("id") Long id){
		Object resultDto = insuranceServiceImpl.getByInsuranceId(id);
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@PostMapping()
	public ResponseEntity<?> createInsurance(@RequestBody InsuranceDto insuraceDto){
		Object resultDto = insuranceServiceImpl.createInsurance(insuraceDto);
		if(resultDto instanceof InsuranceDto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(resultDto);
		}
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@PutMapping()
	public ResponseEntity<?> updateInsurance(@RequestBody InsuranceDto insuranceDto){
		Object resultDto = insuranceServiceImpl.updateInsurance(insuranceDto);
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteInsurance(@PathVariable Long id){
		insuranceServiceImpl.deleteInsurance(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}
	

}
