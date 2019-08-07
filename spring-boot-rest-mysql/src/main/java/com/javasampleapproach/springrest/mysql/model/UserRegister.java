package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRegister {
 
	
	public UserRegister() {
		
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	@Column(name="gender")
	private String gender;
	@Column(name="name")
	private String userName1;
	@Column(name="password")
	private String password;
	@Column(name="known_us")
	private String knownUs;
	@Column(name="country")
	private String country;
	@Column(name="city")
	private String city;
	@Column(name="date")
	private String date;
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
	public String getUserName() {
		return userName1;
	}
	public void setUserName(String userName) {
		this.userName1 = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKnownUs() {
		return knownUs;
	}
	public void setKnownUs(String knownUs) {
		this.knownUs = knownUs;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public UserRegister( String gender, String userName, String password, String knownUs, String country,
			String city, String date) {
		super();
		
		this.gender = gender;
		this.userName1 = userName;
		this.password = password;
		this.knownUs = knownUs;
		this.country = country;
		this.city = city;
		this.date = date;
	}
	
	
	
	
}
