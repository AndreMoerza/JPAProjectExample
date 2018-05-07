package com.mitrais.JPAProj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitrais.JPAProj.entity.NonTeachingStaffWeakEntity;
import com.mitrais.JPAProj.entity.TeachingStaffWeakEntity;

public class SaveClient {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//Teaching staff entity
		TeachingStaffWeakEntity ts1 = new TeachingStaffWeakEntity(1,"Gopal","Msc MEd","Maths");
		TeachingStaffWeakEntity ts2 = new TeachingStaffWeakEntity(2,"Manisha","Bsc bEd","English");
		
		//Non-Teaching Staff entity
		NonTeachingStaffWeakEntity nts1 = new NonTeachingStaffWeakEntity(3,"Satish","Accounts");
		NonTeachingStaffWeakEntity nts2 = new NonTeachingStaffWeakEntity(4,"Krishna","Office Admin");
		
		//storing all entities
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
