package com.modcare.patient_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modcare.patient_service.entities.Patient;


public interface PatientRepo extends JpaRepository<Patient, Long> {

}
