package com.modcare.patient_service.model;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Patient {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Name is required")
	private String name;
	@Email(message="Invalid email address")
	private String email;
	@Pattern(regexp="^\\+?[0-9]{10,15}$", message="Invalid phone number")
	private String phone;
	@NotBlank(message="Gender is required")
	private String gender;
	@NotBlank(message="Date of birth must be in the past")
	private String dateofbirth;
	
	//Embedded Address List
	@ElementCollection
	@CollectionTable(name="patient_address",joinColumns=@JoinColumn(name="patient_id"))
	private List<Address> address=new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="patient_insurance", joinColumns=@JoinColumn(name="patient_id"))
	private List<Insurance> insurance=new ArrayList<>();
	
	Patient(){}
	
	Patient(Long id, String name, String email, String phone, String gender, String dateofbirth, List<Address> address, List<Insurance> insurance){
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.gender=gender;
		this.dateofbirth=dateofbirth;
		this.address=address;
		this.insurance=insurance;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getEmail() {
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth)
	{
		this.dateofbirth=dateofbirth;
	}
	public List<Address> getAddress(){
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address=address;
	}
	public List<Insurance> getInsurance(){
		return insurance;
	}
	public void setInsurance(List<Insurance> insurance) {
		this.insurance=insurance;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", dateofbirth=" + dateofbirth + ", address=" + address + ", insurance=" + insurance + "]";
	}
	
	
	
}
