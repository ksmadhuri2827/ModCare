package com.modcare.patient_service.dto;

public class AddressDto {
	
	private Long addressId;
	private Long userId;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public AddressDto() {}
	
	public AddressDto(Long addressId, Long userId, String street, String city, String state, String zip,
			String country) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", userId=" + userId + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	

}
