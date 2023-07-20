package com.ty.Hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	private String hsptlname;
	private String hsptlwebsite;
	@OneToMany(mappedBy="hsptl")
	private List<Branch>bnc;
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHsptlname() {
		return hsptlname;
	}
	public void setHsptlname(String hsptlname) {
		this.hsptlname = hsptlname;
	}
	public String getHsptlwebsite() {
		return hsptlwebsite;
	}
	public void setHsptlwebsite(String hsptlwebsite) {
		this.hsptlwebsite = hsptlwebsite;
	}
	public List<Branch> getBnc() {
		return bnc;
	}
	public void setBnc(List<Branch> bnc) {
		this.bnc = bnc;
	}

}
