package com.ty.Hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Encounter
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int eid;
	private String reason;
	private String dateofjoin;
	private String dateofdischarge;
	@OneToMany(mappedBy ="enc1")
	private List<Observation> obs;
	@ManyToOne
	@JoinColumn
	private Person per;
	@ManyToOne
	@JoinColumn
	private Branch bnc2;
	@OneToMany(mappedBy ="enc2")
	private List<MedOrder>med;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public String getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(String dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public List<Observation> getObs() {
		return obs;
	}
	public void setObs(List<Observation> obs) {
		this.obs = obs;
	}
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public Branch getBnc2() {
		return bnc2;
	}
	public void setBnc2(Branch bnc2) {
		this.bnc2 = bnc2;
	}
	public List<MedOrder> getMed() {
		return med;
	}
	public void setMed(List<MedOrder> med) {
		this.med = med;
	}
	
	

}
