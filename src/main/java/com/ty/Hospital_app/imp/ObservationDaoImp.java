package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.ObservationDao;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.dto.MedOrder;
import com.ty.Hospital_app.dto.Observation;

public class ObservationDaoImp implements ObservationDao 
{

	public Observation saveObservation(int eid, Observation observation) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class,eid);
		if(observation!= null)
		{
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();

			return observation;
		}
		return null;
	
	}

	public Observation getObservationbyId(int oid) {
		
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Observation observation = entityManager.find(Observation.class, oid);

		return observation;
	}

	public boolean deleteObservation(int oid) {
		

		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Observation observation1= entityManager.find(Observation.class ,oid);
		if(observation1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(observation1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Observation updateObservation(int oid, Observation observation) {
		



		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

	Observation observation2 = entityManager.find(Observation.class ,oid);

		if(observation2!=null)
		{
			observation2.setDname(observation.getDname());
			observation2.setrObservation(observation.getrObservation());
			entityTransaction.begin();
			entityManager.merge(observation2);
			entityTransaction.commit();
			return observation;
		}
		else
		{
			
		return null;
		}
	}

	public List<Observation> getAllObservation() {
		

		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Observation a");
		
		List<Observation> observation = query.getResultList();

		return observation;
	}

}
