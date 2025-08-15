package com.modcare.patient_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modcare.patient_service.entities.Address;

import java.util.List;


public interface AddressRepo extends JpaRepository<Address, Long>{
	List<Address> findByUserId(Long userId);

}
