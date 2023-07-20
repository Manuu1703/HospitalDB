package com.ty.Hospital_app.controll;

import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.service.HospitalService;

public class TestUpdateHospital {
public static void main(String[] args) {
	Hospital hospital = new Hospital();
	HospitalService service = new HospitalService();
	hospital.setHsptlname("JayadevKumar");
	hospital.setHsptlwebsite("www.jayadevkumar.com");
	service.updateHospitalById(2, hospital);
}
}
