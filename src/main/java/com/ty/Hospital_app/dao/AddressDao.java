package com.ty.Hospital_app.dao;

import java.util.List;

import com.ty.Hospital_app.dto.Adress;

public interface AddressDao 
{
public Adress saveAdress(int bid,Adress adress);

public Adress getAdress(int aid);

public boolean deleteAdress(int aid);

public Adress updateAdress(int aid, Adress adress);

public List<Adress> getAllAdress();
}
