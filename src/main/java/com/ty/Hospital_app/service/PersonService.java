package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Observation;
import com.ty.Hospital_app.dto.Person;
import com.ty.Hospital_app.imp.ObservationDaoImp;
import com.ty.Hospital_app.imp.PersonDaoImp;

public class PersonService 
{
	public void savePerson(Person person,int eid)
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.savePerson(eid,person);
		if(person1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Person getPersononById(int pid)
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.getPersonbyId(pid);
		if(person1!=null)
		{
			return person1;

		}
		else
		{
			return null;
		}
	}
	public void deletePersonBYId(int pid)
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		boolean flag = daoImp.deletePerson(pid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Person updatePersonnById(int pid,Person person)
	{
		PersonDaoImp daoImp = new PersonDaoImp();
		Person person1 = daoImp.updatePerson(pid, person);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}

	}

}
