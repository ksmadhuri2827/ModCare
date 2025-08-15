package com.modcare.patient_service.mappers;



import com.modcare.patient_service.dto.AddressDto;
import com.modcare.patient_service.entities.Address;

public class AddressMapper {
	
	public static AddressDto maptoAddressDto(Address addressEntity) {
		if(addressEntity==null) {
			return null;
		}
		return new AddressDto(
				addressEntity.getAddressId(),
				addressEntity.getUserId(),
				addressEntity.getStreet(),
				addressEntity.getCity(),
				addressEntity.getState(),
				addressEntity.getZip(),
				addressEntity.getCountry()
				);
	}
	
	public static Address maptoAddressEntity(AddressDto addressDto) {
		if(addressDto==null) {
			return null;
		}
		return new Address(
				addressDto.getAddressId(),
				addressDto.getUserId(),
				addressDto.getStreet(),
				addressDto.getCity(),
				addressDto.getState(),
				addressDto.getZip(),
				addressDto.getCountry()
				
				);
	}

}
