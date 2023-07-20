package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.AddressDao;
import com.ty.Hospital_app.dto.Adress;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Hospital;

public class AdressDaoImp implements AddressDao
{

	public Adress saveAdress(int bid, Adress adress) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class,bid);
		if(adress!= null)
		{
			entityTransaction.begin();
			entityManager.persist(adress);
			entityTransaction.commit();

			return adress;
		}
		return null;
	}

	public Adress getAdress(int aid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Adress adress = entityManager.find(Adress.class, aid);

		return adress;
	}

	public boolean deleteAdress(int aid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Adress adress1= entityManager.find(Adress.class ,aid);
		if(adress1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(adress1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Adress updateAdress(int aid, Adress adress) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

	Adress adress2 = entityManager.find(Adress.class ,aid);

		if(adress2!=null)
		{
			adress2.setStreet(adress.getStreet());
			adress2.setState(adress.getState());
			entityTransaction.begin();
			entityManager.merge(adress2);
			entityTransaction.commit();
			return adress;
		}
		else
		{
			
		return null;
		}
	}

	public List<Adress> getAllAdress() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Adress a");
		
		List<Adress> adress = query.getResultList();

		return adress;
	}

}
