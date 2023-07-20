package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.UserDao;
import com.ty.Hospital_app.dto.Hospital;
import com.ty.Hospital_app.dto.Observation;
import com.ty.Hospital_app.dto.User;

public class UserDaoImp implements UserDao
{

	public User saveUser(User user) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(user);

		entityTransaction.commit();

		return user;
	}

	public User getUserbyId(int uid) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class,uid);

		return user;
	}

	public boolean deleteuser(int uid) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class ,uid);
		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public User updateUser(int uid, User user) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user1 = entityManager.find(User.class ,uid);

		if(user1!=null)
		{
			user1.setPassword(user.getPassword());
			user1.setRole(user.getRole());
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return user;
		}
		else
		{
			return null;
		}
	}

	public List<User> getAllUser() {
		

		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from User a");
		
		List<User> user = query.getResultList();

		return user;
	
	}

	public List<User> getUserByRole(String role) {
		

		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from User a where role=role");
		
		List<User> user = query.getResultList();

		return user;
	}

}
