package com.javasampleapproach.springrest.mysql.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {
	
	public Photo() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id ;
	@Column(name="url")
	private String url;
	@Column(name="description")
	private String description;
	@Column(name="date")
	private Date  dateAdded;
	@Column(name="isMain")
	private boolean isMain;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public boolean isMain() {
		return isMain;
	}
	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}
	public Photo(String url, String description) {
		super();
		
		this.url = url;
		this.description = description;
		
	}
	@Override
	public String toString() {
		return "Photo [ url=" + url + ", description=" + description + "]";
	}
	
	

}
