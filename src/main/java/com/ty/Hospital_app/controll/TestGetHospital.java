package com.ty.Hospital_app.controll;

import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.service.HospitalService;

public class TestGetHospital {
public static void main(String[] args) {
	HospitalService service = new HospitalService();
	Hospital hospital=service.getHospitalById(1);
	System.out.println(hospital.getHsptlname());
	System.out.println(hospital.getHid());
	System.out.println(hospital.getHsptlwebsite());
}
}
