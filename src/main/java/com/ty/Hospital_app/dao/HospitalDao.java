package com.ty.Hospital_app.dao;

import com.ty.Hospital_app.dto.Hospital;

public interface HospitalDao 
{
public Hospital saveHospital(Hospital hospital);

public Hospital getHospitalById(int hid);

public boolean deleteHospital(int hid);

public Hospital updateHospital(int hid,Hospital hospital);
}
