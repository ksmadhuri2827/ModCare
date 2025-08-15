package com.modcare.patient_service.utils;

import com.modcare.patient_service.dto.AddressDto;

public class AddressValidation {
	
	public static boolean validateAddressDto(AddressDto addressDto) {
		if(addressDto.getUserId()==null) {
			return false;
		}
		if(addressDto.getStreet()==null) {
			return false;
		}
		if(addressDto.getCity()==null) {
			return false;
		}
		if(addressDto.getState()==null) {
			return false;
		}
		if(addressDto.getCountry()==null) {
			return false;
		}
		if(addressDto.getZip()==null) {
			return false;
		}
		return true;
	}

}
