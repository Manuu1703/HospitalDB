package com.ty.Hospital_app.dao;

import java.util.List;

import com.ty.Hospital_app.dto.MedOrder;

public interface MedOrderDao {

	public MedOrder saveMedOrder(int eid, MedOrder medorder);
	
	public MedOrder getMedOrder(int mid);
	
	public boolean deleteMedOrder(int mid);
	
	public MedOrder updateMedOrder(int mid,MedOrder medOrder);
	
	public List<MedOrder> getMedOrderByDoctorName(String name);
	
	//public List<MedOrder> getMedOrderByDate(String date);
}
