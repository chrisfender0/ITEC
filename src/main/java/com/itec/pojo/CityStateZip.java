package com.itec.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citystatezip")
public class CityStateZip {
	
	@Id
	private int id;
	private String city, state, zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public CityStateZip(int id, String city, String state, String zip) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public CityStateZip() {
		
	}

}
