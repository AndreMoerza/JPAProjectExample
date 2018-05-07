package com.mitrais.JPAProj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitrais.JPAProj.entity.NonTeachingStaffTables;
import com.mitrais.JPAProj.entity.TeachingStaffTables;

public class SaveClientTables {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//Teaching staff entity
		TeachingStaffTables ts1 = new TeachingStaffTables(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaffTables ts2 = new TeachingStaffTables(2, "Manisha", "BSc BEd", "English");
		
		//Non-Teaching staff entity
		NonTeachingStaffTables nts1 = new NonTeachingStaffTables(3,"Satish", "Accounts");
		NonTeachingStaffTables nts2 = new NonTeachingStaffTables(4, "Krishna", "Office Admin");
		
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
