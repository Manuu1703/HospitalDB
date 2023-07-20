package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.MedOrderDao;
import com.ty.Hospital_app.dto.Adress;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDao
{

	public MedOrder saveMedOrder(int eid, MedOrder medorder) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class,eid);
		if(medorder!= null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();

			return medorder;
		}
		return null;
	
	}

	public MedOrder getMedOrder(int mid) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		MedOrder medorder = entityManager.find(MedOrder.class, mid);

		return medorder;
	}

	public boolean deleteMedOrder(int mid) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		MedOrder medorder1= entityManager.find(MedOrder.class ,mid);
		if(medorder1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(medorder1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public MedOrder updateMedOrder(int mid, MedOrder medOrder) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

	MedOrder medorder2 = entityManager.find(MedOrder.class ,mid);

		if(medorder2!=null)
		{
			medorder2.setDname(medOrder.getDname());
			medorder2.setOrderdate(medOrder.getOrderdate());
			entityTransaction.begin();
			entityManager.merge(medorder2);
			entityTransaction.commit();
			return medOrder;
		}
		else
		{
			
		return null;
		}
	}

	public List<MedOrder> getMedOrderByDoctorName(String name) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from MedOrder a where name=dname");
		
		List<MedOrder> medorder = query.getResultList();

		return medorder;
	}

}
