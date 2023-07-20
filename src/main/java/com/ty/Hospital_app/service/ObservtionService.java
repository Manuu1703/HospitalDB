package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.MedOrder;
import com.ty.Hospital_app.dto.Observation;
import com.ty.Hospital_app.imp.MedOrderDaoImp;
import com.ty.Hospital_app.imp.ObservationDaoImp;

public class ObservtionService 
{
	public void saveObservation(Observation observation,int eid)
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Observation getObservationById(int oid)
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.getObservationbyId(oid);
		if(observation1!=null)
		{
			return observation1;

		}
		else
		{
			return null;
		}
	}
	public void deleteObservationBYId(int oid)
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		boolean flag = daoImp.deleteObservation(oid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Observation updateObservationById(int oid,Observation observation)
	{
		ObservationDaoImp daoImp = new ObservationDaoImp();
		Observation observation1 = daoImp.updateObservation(oid, observation);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}

	}
}


