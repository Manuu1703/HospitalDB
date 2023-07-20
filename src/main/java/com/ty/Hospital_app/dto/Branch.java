package com.ty.Hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String branchname;
	private long branchphno;
	private String branchEmail;
	@JoinColumn
	@ManyToOne
	private Hospital hsptl;
	@JoinColumn
	@OneToOne
	private Adress add;
	@OneToMany(mappedBy ="bnc2")
	private List<Encounter>enc;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public long getBranchphno() {
		return branchphno;
	}
	public void setBranchphno(long branchphno) {
		this.branchphno = branchphno;
	}
	public String getBranchEmail() {
		return branchEmail;
	}
	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}
	public Hospital getHsptl() {
		return hsptl;
	}
	public void setHsptl(Hospital hsptl) {
		this.hsptl = hsptl;
	}
	public Adress getAdd() {
		return add;
	}
	public void setAdd(Adress add) {
		this.add = add;
	}
	public List<Encounter> getEnc() {
		return enc;
	}
	public void setEnc(List<Encounter> enc) {
		this.enc = enc;
	}
	
	

}
