package com.ty.Hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int oid;
private String dname;
private String rObservation;
@ManyToOne
@JoinColumn
private Encounter enc1;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getrObservation() {
	return rObservation;
}
public void setrObservation(String rObservation) {
	this.rObservation = rObservation;
}
public Encounter getEnc1() {
	return enc1;
}
public void setEnc1(Encounter enc1) {
	this.enc1 = enc1;
}

}
