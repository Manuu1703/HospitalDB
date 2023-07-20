package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.imp.HospitalDaoImp;

public class HospitalService 
{
	public void savehospital(Hospital hospital)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.saveHospital(hospital);
		if(hospital1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public Hospital getHospitalById(int hid)
	{
		
			HospitalDaoImp daoImp = new HospitalDaoImp();
			Hospital hospital1 = daoImp.getHospitalById(hid);
			if(hospital1!=null)
			{
				return hospital1;

			}
			else
			{
				return null;
			}
		}
	
	public void deleteHospitalById(int hid)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		boolean flag = daoImp.deleteHospital(hid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public Hospital updateHospitalById(int hid,Hospital hospital)
	{
		HospitalDaoImp daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.updateHospital(hid, hospital);
		if(hospital1!=null)
		{
			return hospital;
		}
		else
		{
			return null;
		}
				
	}
}



