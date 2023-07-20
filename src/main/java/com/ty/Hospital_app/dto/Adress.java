package com.ty.Hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int aid;
	private String street;
	private String state;
	private String country;
	private int pincode;
	@OneToOne(mappedBy ="add")
	private Branch bnc1;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) 
	{
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Branch getBnc1() {
		return bnc1;
	}
	public void setBnc1(Branch bnc1) {
		this.bnc1 = bnc1;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
