package com.modcare.patient_service.service;
import com.modcare.patient_service.dto.AddressDto;


public interface IAddressService{
	
	public Object getByAddressId(Long addressId);
	public AddressDto getByUserId(Long userId);
	public Object createAddress(AddressDto addressdto);
	public Object updateAddress(AddressDto addressdto);
	public void deleteAddressById(Long addressId);

}
