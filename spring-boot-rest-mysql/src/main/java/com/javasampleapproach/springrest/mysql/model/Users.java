package com.javasampleapproach.springrest.mysql.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Users {
	public Users() {
		
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	@Column(name="gender")
	private String gender;
	@Column(name="name")
	private String userName;
	@Column(name="known_us")
	private String knownUs;
	@Column(name="country")
	private String country;
	@Column(name="city")
	private String city;
	private Date date;
    private Date created;
    private Date lastActive;
    private String photoUrl;
    private String interst;
    private String introducation;
    private String lookingfor;
    //@JoinColumn(name = "photo", referencedColumnName = "photo2")
   /*
    @ManyToOne()
    @JoinColumn(name="photo")
    private Photo photo;
	*/
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
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getLastActive() {
		return lastActive;
	}
	public void setLastActive(Date lastActive) {
		this.lastActive = lastActive;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getInterst() {
		return interst;
	}
	public void setInterst(String interst) {
		this.interst = interst;
	}
	public String getIntroducation() {
		return introducation;
	}
	public void setIntroducation(String introducation) {
		this.introducation = introducation;
	}
	public String getLookingfor() {
		return lookingfor;
	}
	public void setLookingfor(String lookingfor) {
		this.lookingfor = lookingfor;
	}
	/*
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}  */
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", gender=" + gender + ", userName=" + userName + ", knownUs=" + knownUs
				+ ", country=" + country + ", city=" + city + ", date=" + date + ", created=" + created
				+ ", lastActive=" + lastActive + ", photoUrl=" + photoUrl + ", interst=" + interst + ", introducation="
				+ introducation + ", lookingfor=" + lookingfor  + "]";
	}
	public Users(String gender, String userName, String knownUs, String country, String city, Date date, Date created,
			Date lastActive, String photoUrl, String interst, String introducation, String lookingfor) {
		super();
		this.gender = gender;
		this.userName = userName;
		this.knownUs = knownUs;
		this.country = country;
		this.city = city;
		this.date = date;
		this.created = created;
		this.lastActive = lastActive;
		this.photoUrl = photoUrl;
		this.interst = interst;
		this.introducation = introducation;
		this.lookingfor = lookingfor;
	}
    
   

}
