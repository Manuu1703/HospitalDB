package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.EncounterDao;
import com.ty.Hospital_app.dto.Adress;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Encounter;

public class EncounterDaoImp implements EncounterDao
{

	public Encounter saveEncounter(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class,bid);
		if(encounter!= null)
		{
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();

			return encounter;
		}
		return null;
	}

	public Encounter getEncounterbyId(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Encounter encounter = entityManager.find(Encounter.class, eid);

		return encounter;
	}

	public boolean deleteEncounter(int eid) {
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter1= entityManager.find(Encounter.class ,eid);
		if(encounter1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(encounter1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter2 = entityManager.find(Encounter.class ,eid);

		if(encounter2!=null)
		{
			encounter2.setReason(encounter.getReason());
			encounter2.setReason(encounter.getReason());
			entityTransaction.begin();
			entityManager.merge(encounter2);
			entityTransaction.commit();
			return encounter;
		}
		else
		{
			
		return null;
		}
	
	}

	public List<Encounter> getAllEncounter() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Encounter a");
		
		List<Encounter> encounter = query.getResultList();

		return encounter;
	}
}
