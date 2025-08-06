package com.modcare.patient_service.model;

public class Insurance {
	
	private String provider;
	private String policyNumber;
	private String coverageType;
	private String expiryDate;
	
    public Insurance() {}

	public Insurance(String provider, String policyNumber, String coverageType, String expiryDate) {
		super();
		this.provider = provider;
		this.policyNumber = policyNumber;
		this.coverageType = coverageType;
		this.expiryDate = expiryDate;
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
		return "Insurance [provider=" + provider + ", policyNumber=" + policyNumber + ", coverageType=" + coverageType
				+ ", expiryDate=" + expiryDate + "]";
	}
    
    
	
	

}
