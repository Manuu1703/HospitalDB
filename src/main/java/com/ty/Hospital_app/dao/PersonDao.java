package com.ty.Hospital_app.dao;

import java.util.List;

import com.ty.Hospital_app.dto.Person;

public interface PersonDao {

	public Person savePerson(int eid,Person person);
	
	public Person getPersonbyId(int pid);
	
	public boolean deletePerson(int pid);
	
	public Person updatePerson(int pid,Person person);
	
	public List<Person> getAllPerson();
	
	public List<Person> getAllPersonByGender(String name);
	
	public List<Person> getAllPersonByAge(int age);
	
	public List<Person> getAllPersonByPhno(long phno);
}
