package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.dto.MedOrder;
import com.ty.Hospital_app.imp.EncounterDaoImp;
import com.ty.Hospital_app.imp.MedOrderDaoImp;

public class MedOrderService
{
	public void saveMedorder(MedOrder medorder,int eid)
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		MedOrder medOrder1 = daoImp.saveMedOrder(eid, medorder);
		if(medOrder1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public MedOrder getMedOrderById(int mid)
	{
        MedOrderDaoImp daoImp = new MedOrderDaoImp();
        MedOrder medOrder1 = daoImp.getMedOrder(mid);
		if(medOrder1!=null)
		{
			return medOrder1;

		}
		else
		{
			return null;
		}
	}
	public void deleteMedOrderBYId(int mid)
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		boolean flag = daoImp.deleteMedOrder(mid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}

	public MedOrder updateMedOrderById(int mid,MedOrder medorder)
	{
		MedOrderDaoImp daoImp = new MedOrderDaoImp();
		MedOrder medOrder1 = daoImp.updateMedOrder(mid, medorder);
		if(medOrder1!=null)
		{
			return medOrder1;
		}
		else
		{
			return null;
		}

	}
}
