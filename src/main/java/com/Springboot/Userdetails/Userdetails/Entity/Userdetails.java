package com.Springboot.Userdetails.Userdetails.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Userdetails_db")
@NoArgsConstructor
@AllArgsConstructor
public class Userdetails {

	@Id
	@Column(name="Id")
	@GeneratedValue
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="userStatus")
	private String userStatus;
	
}
