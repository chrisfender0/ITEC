package com.itec.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products implements Serializable{
	
	@Id
	private int id;
	private String type, name, description, image;
	private double retailprice;
	
	public Products() {
		
	}
	
	public Products(int id, String type, String name, String description, double retailprice, String image) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.description = description;
		this.image = image;
		this.retailprice = retailprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getRetailprice() {
		return retailprice;
	}
	public void setRetailprice(double retailprice) {
		this.retailprice = retailprice;
	}
	
}
