package com.modcare.patient_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "insurance" )
public class Insurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long insuranceId;
	private Long patientId;
	private String provider;
	private String policyNumber;
	private String coverageType;
	private String expiryDate;
	
    public Insurance() {}

	public Insurance(Long insuranceId, Long patientId,String provider, String policyNumber, String coverageType, String expiryDate) {
		super();
		this.insuranceId = insuranceId;
		this.patientId=patientId;
		this.provider = provider;
		this.policyNumber = policyNumber;
		this.coverageType = coverageType;
		this.expiryDate = expiryDate;
	}
	

	public Long getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Long insuranceId) {
		this.insuranceId = insuranceId;
	}
	
	public Long getPatientId() {
		return patientId;
	}
    
	public void setPatientId(Long patientId) {
		
		this.patientId=patientId;
	}
	
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", provider=" + provider + ", policyNumber=" + policyNumber
				+ ", coverageType=" + coverageType + ", expiryDate=" + expiryDate + "]";
	}


    
    
	
	

}
