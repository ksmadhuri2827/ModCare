package com.modcare.patient_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modcare.patient_service.entities.Insurance;


public interface InsuranceRepo extends JpaRepository<Insurance, Long> {
	List<Insurance> findByPatientId(Long patientId);
}
