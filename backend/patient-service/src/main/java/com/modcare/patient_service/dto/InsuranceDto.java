package com.modcare.patient_service.dto;

public class InsuranceDto {
	
	private Long insuranceId;
	private Long patientId;
	private String provider;
	private String policyNumber;
	private String coverageType;
	private String expiryDate;
	
    public InsuranceDto() {}

	public InsuranceDto(Long insuranceId,Long patientId, String provider, String policyNumber, String coverageType, String expiryDate) {
		super();
		this.insuranceId = insuranceId;
		this.patientId=patientId;
		this.provider = provider;
		this.policyNumber = policyNumber;
		this.coverageType = coverageType;
		this.expiryDate = expiryDate;
	}
	
	public Long getPatientId() {
		return patientId;
	}
	
	public void setPatientId(Long patientId) {
		this.patientId=patientId;
	}

	public Long getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Long insuranceId) {
		this.insuranceId = insuranceId;
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
