package com.ty.Hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Hospital_app.dao.PersonDao;
import com.ty.Hospital_app.dto.Encounter;
import com.ty.Hospital_app.dto.MedOrder;
import com.ty.Hospital_app.dto.Observation;
import com.ty.Hospital_app.dto.Person;

public class PersonDaoImp  implements PersonDao
 {

	public Person savePerson(int eid, Person person) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Encounter encounter = entityManager.find(Encounter.class,eid);
		if(person!= null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();

			return person;
		}
		else
		{
		return null;
		}
	}

	public Person getPersonbyId(int pid) {
		

		
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, pid);

		return null;
	}

	public boolean deletePerson(int pid) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person1= entityManager.find(Person.class ,pid);
		if(person1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int pid, Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

	Person person2 = entityManager.find(Person.class ,pid);

		if(person2!=null)
		{
			person2.setPersonName(person.getPersonName());
			person2.setAge(person.getAge());
			entityTransaction.begin();
			entityManager.merge(person2);
			entityTransaction.commit();
			return person;
		}
		else
		{
			
		return null;
		}
	}

	public List<Person> getAllPerson() {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Person a ");
		
		List<Person> person = query.getResultList();

		return person;
	}

	public List<Person> getAllPersonByGender(String name) {
		

		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Person a where gender = gender");
		
		List<Person> person = query.getResultList();

		return person;
	}

	public List<Person> getAllPersonByAge(int age) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Person a where age=age");
		
		List<Person> person = query.getResultList();

		return person;
	}

	public List<Person> getAllPersonByPhno(long phno) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ruthu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
      
		Query query = entityManager.createQuery("select a from Person a where phno=personphno");
		
		List<Person> person = query.getResultList();

		return person;
	}

}
