package com.ty.Hospital_app.controll;

import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.service.HospitalService;

public class TestSaveHospital 
{
 public static void main(String[] args) {
	Hospital hospital = new Hospital();
	HospitalService service = new HospitalService();
	hospital.setHsptlname("Basaveshwara");
	hospital.setHsptlwebsite("www.basaweshwara.com");
	service.savehospital(hospital);
}
}
