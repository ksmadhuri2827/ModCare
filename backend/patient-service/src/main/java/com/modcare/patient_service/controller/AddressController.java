package com.modcare.patient_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modcare.patient_service.dto.AddressDto;
import com.modcare.patient_service.service.AddressServiceImpl;
import com.modcare.patient_service.utils.HelperFunctions;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/address")
public class AddressController {
	
	@Autowired
	AddressServiceImpl addressServiceImpl;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getByAddressId(@PathVariable("id") Long id){
		Object resultDto=addressServiceImpl.getByAddressId(id);
		return HelperFunctions.getResponseEntity(resultDto);
		
	}
	
	@PostMapping()
    public ResponseEntity<?> createAddress(@RequestBody AddressDto addressDto){
		Object resultDto=addressServiceImpl.createAddress(addressDto);
		if(resultDto instanceof AddressDto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(resultDto);
		}
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@PutMapping
    public ResponseEntity<?> updateAddress(@RequestBody AddressDto addressDto){
		Object resultDto=addressServiceImpl.updateAddress(addressDto);
		return HelperFunctions.getResponseEntity(resultDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteAddress(@PathVariable("id") Long id){
		addressServiceImpl.deleteAddressById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}
	
	
	
	
	
	
	
	
}
