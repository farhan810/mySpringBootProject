package com.javasampleapproach.springrest.mysql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RegisterUsers")
public class Register {

	public Register() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String gender;
	
	private String username;
	private String knownAs;
	private Date dateOfBirth;
	private String city;
	private String country;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKnownAs() {
		return knownAs;
	}
	public void setKnownAs(String knownAs) {
		this.knownAs = knownAs;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Register(Integer id, String gender, String username, String knownAs, Date dateOfBirth, String city,
			String country, String password) {
		super();
		this.id = id;
		this.gender = gender;
		this.username = username;
		this.knownAs = knownAs;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.country = country;
		this.password = password;
	}
	
	/// new line of code from here ..
	
	


	
	
}
