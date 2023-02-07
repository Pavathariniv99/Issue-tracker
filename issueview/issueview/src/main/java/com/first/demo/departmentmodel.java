package com.first.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="depts")

public class departmentmodel {
	
@Id
		
		private String departname;
		private String email;
		private String mobile;
		public String getDepartname() {
			return departname;
		}
		public void setDepartname(String departname) {
			this.departname = departname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
		
}

	

