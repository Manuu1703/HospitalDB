package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Adress;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.imp.AdressDaoImp;
import com.ty.Hospital_app.imp.BranchDaoImp;

public class AdressService 
{
	public void saveAdress(Adress adress,int bid)
	{
        AdressDaoImp daoImp = new AdressDaoImp();
		Adress adress1 = daoImp.saveAdress(bid, adress);
		if(adress1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Adress getadressById(int aid)
	{
		AdressDaoImp daoImp = new AdressDaoImp();
		Adress adress1 = daoImp.getAdress(aid);
		if(adress1!=null)
		{
			return adress1;

		}
		else
		{
			return null;
		}
	}
	public void deleteAdressById(int aid)
	{
		AdressDaoImp daoImp = new AdressDaoImp();
		boolean flag = daoImp.deleteAdress(aid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Adress updateAdressById(int aid,Adress adress)
	{
		AdressDaoImp daoImp = new AdressDaoImp();
		Adress adress1 = daoImp.updateAdress(aid, adress);
		if(adress1!=null)
		{
			return adress1;
		}
		else
		{
			return null;
		}

	}
}
