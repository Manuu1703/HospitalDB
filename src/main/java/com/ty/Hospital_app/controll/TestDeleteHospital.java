package com.ty.Hospital_app.controll;

import com.ty.Hospital_app.service.HospitalService;

public class TestDeleteHospital {
public static void main(String[] args) {
	HospitalService service = new HospitalService(); 
	service.deleteHospitalById(3);
	
}
}
