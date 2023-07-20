package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.ItemDao;
import com.ty.Hospital_app.dto.Branch;
import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.dto.Item;
import com.ty.Hospital_app.dto.MedOrder;

public class ItemDaoImp  implements ItemDao
{

	public Item saveItem(int mid, Item item) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

	 MedOrder medorder = entityManager.find(MedOrder.class,mid);
		if(item!= null)
		{
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();

			return item;
		}
		return null;
	}

	public Item getItembyId(int iid) {

	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Item item = entityManager.find(Item.class, iid);

		return item;
	}

	public boolean deleteItem(int iid) {
		
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item1= entityManager.find(Item.class ,iid);
		if(item1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(item1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int iid, Item item) {
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item2 = entityManager.find(Item.class ,iid);

		if(item2!=null)
		{
			item2.setItemName(item.getItemName());
			item2.setCost(item.getCost());
			entityTransaction.begin();
			entityManager.merge(item2);
			entityTransaction.commit();
			return item;
		}
		else
		{
			
		return null;
		}
	
	}

	public List<Item> getAllItem() {
		

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Item a");
		
		List<Item> item = query.getResultList();

		return item;
	}

}
