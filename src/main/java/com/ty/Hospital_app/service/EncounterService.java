package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Adress;
import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.imp.AdressDaoImp;
import com.ty.Hospital_app.imp.EncounterDaoImp;

public class EncounterService 
{
	public void saveEncounter(Encounter encounter,int bid)
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.saveEncounter(bid, encounter);
		if(encounter1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Encounter getEncounterByID(int eid)
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.getEncounterbyId(eid);
		if(encounter1!=null)
		{
			return encounter1;

		}
		else
		{
			return null;
		}
	}
	public void deleteEncounterById(int eid)
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		boolean flag = daoImp.deleteEncounter(eid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Encounter updateEncounterById(int eid,Encounter encounter)
	{
		EncounterDaoImp daoImp = new EncounterDaoImp();
		Encounter encounter1 = daoImp.updateEncounter(eid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}

	}
}
