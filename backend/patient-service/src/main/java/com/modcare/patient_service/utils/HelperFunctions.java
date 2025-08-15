package com.modcare.patient_service.utils;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class HelperFunctions {
	
	public static ResponseEntity<?> getResponseEntity(Object response){
		if(Objects.equals(response, ErrorCodes.PatientNotFound)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found!");
		}else if (Objects.equals(response, ErrorCodes.ValidationFailed)) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Validation failed!");
		}
		else if(Objects.equals(response, ErrorCodes.AddressNotFound)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not found!");
		}
		else if(Objects.equals(response, ErrorCodes.InsuranceNotFound)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Insurance not found!");
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}
	}

}
