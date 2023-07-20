package com.ty.Hospital_app.dao;

import java.util.List;

import com.ty.Hospital_app.dto.Observation;

public interface ObservationDao 
{
public Observation saveObservation(int eid ,Observation observation);

public Observation getObservationbyId(int oid);

public boolean deleteObservation(int oid);

public Observation updateObservation(int oid, Observation observation);

public List<Observation> getAllObservation();
}
