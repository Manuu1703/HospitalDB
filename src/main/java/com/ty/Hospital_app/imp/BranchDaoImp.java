package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.BranchDao;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Hospital;

public class BranchDaoImp implements BranchDao
{

	public Branch saveBranch(int hid, Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class,hid);
		if(hospital!= null)
		{
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();

			return branch;
		}
		return null;
	}

	public Branch getBranchId(int bid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, bid);

		return branch;
	}

	public boolean deleteBranch(int bid) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branchl= entityManager.find(Branch.class ,bid);
		if(branchl!=null)
		{
			entityTransaction.begin();
			entityManager.remove(branchl);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Branch updateBranch(int bid, Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch2 = entityManager.find(Branch.class ,bid);

		if(branch2!=null)
		{
			branch2.setBranchname(branch.getBranchname());
			branch2.setBranchEmail(branch.getBranchEmail());
			entityTransaction.begin();
			entityManager.merge(branch2);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			
		return null;
		}
	}

	public List<Branch> getAllBranch() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select s from Branch s");
		
		List<Branch> branch = query.getResultList();

		return branch;
	}

}
