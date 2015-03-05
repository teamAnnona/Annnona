package com.sa.hlo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class RegisterBo {
	
		//properties of RegisterCommand class
		@Id
		private String firstName;
		@Column
		private String secondName;
		@Column
		private String mobile;
		@Column
		private String email;
		@Column
		private String address;
		@Column
		private String maritalstatus;
		@Column
		private  String alternativeemail;
		@Column
		private String citizenship;
		
		
		
		
		
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getEmail() {
			return email;
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
		
		
		//settrs and getters of attributes
		
		
}
