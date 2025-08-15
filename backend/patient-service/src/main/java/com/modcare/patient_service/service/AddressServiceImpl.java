package com.modcare.patient_service.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.modcare.patient_service.dto.AddressDto;
import com.modcare.patient_service.entities.Address;
import com.modcare.patient_service.mappers.AddressMapper;
import com.modcare.patient_service.repo.AddressRepo;
import com.modcare.patient_service.utils.AddressValidation;
import com.modcare.patient_service.utils.ErrorCodes;

@Service
public class AddressServiceImpl implements IAddressService {
	
	@Autowired
	AddressRepo addressRepo;
	
	
	public Object getByAddressId(Long addressId)
	{
		AddressDto addressDto=AddressMapper.maptoAddressDto(addressRepo.findById(addressId).orElse(null));
		if(addressDto==null) {
			return ErrorCodes.AddressNotFound;
		}
		return addressDto;
	}
	public Object createAddress(AddressDto addressdto)
	{
		if(AddressValidation.validateAddressDto(addressdto)) {
			
			Address address=AddressMapper.maptoAddressEntity(addressdto);
			AddressDto createdAddressDto=AddressMapper.maptoAddressDto(addressRepo.save(address));
			return createdAddressDto;
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
	}
	public Object updateAddress(AddressDto addressdto)
	{
		if(AddressValidation.validateAddressDto(addressdto) && addressdto.getAddressId()!=null) {
			
			Address address=addressRepo.findById(addressdto.getAddressId()).orElse(null);
			if(address!=null) {
				address.setStreet(addressdto.getStreet());
				address.setCity(addressdto.getCity());
				address.setState(addressdto.getState());
				address.setCountry(addressdto.getCountry());
				address.setZip(addressdto.getZip());
			}
			
			AddressDto updatesAddressDto=AddressMapper.maptoAddressDto(addressRepo.save(address));
			return updatesAddressDto;
			
			
		}
		else {
			return ErrorCodes.ValidationFailed;
		}
	}
	public void deleteAddressById(Long addressId)
	{
		if(addressId==null) return;
		
		addressRepo.deleteById(addressId);
	}
	@Override
	public AddressDto getByUserId(Long userId) {
		List<Address> addressList = addressRepo.findByUserId(userId);
		if(addressList.size()<1) {
			return null;
		}
		return AddressMapper.maptoAddressDto(addressList.get(0));
	}

}
