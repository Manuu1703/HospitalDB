package com.ty.Hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String personName;
	private String personAdress;
	private long personPhno;
	private int age;
	private String gender;
	@OneToMany(mappedBy = "per")
	private List<Encounter>enc3;
	public int getPid() 
	{
		return pid;
	}
	public void setPid(int pid) 
	{
		this.pid = pid;
	}
	public String getPersonName() 
	{
		return personName;
	}
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	public String getPersonAdress() 
	{
		return personAdress;
	}
	public void setPersonAdress(String personAdress)
	{
		this.personAdress = personAdress;
	}
	public long getPersonPhno() 
	{
		return personPhno;
	}
	public void setPersonPhno(long personPhno) {
		this.personPhno = personPhno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Encounter> getEnc3() {
		return enc3;
	}
	public void setEnc3(List<Encounter> enc3) {
		this.enc3 = enc3;
	}

}
