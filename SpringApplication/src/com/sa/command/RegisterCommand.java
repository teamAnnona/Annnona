package com.sa.command;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;



public class RegisterCommand {
	//properties of RegisterCommand class
	private String firstName;
	private String secondName;
	private String mobile;
	private String email;
	private String address;
	private String maritalstatus;
	private  String alternativeemail;
	private String citizenship;
	
	

	//settrs and getters of attributes
	
	
	
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getAlternativeemail() {
		return alternativeemail;
	}
	public void setAlternativeemail(String alternativeemail) {
		this.alternativeemail = alternativeemail;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
