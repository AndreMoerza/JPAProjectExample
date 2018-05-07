package com.mitrais.JPAProj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitrais.JPAProj.entity.NonTeachingStaffJoined;
import com.mitrais.JPAProj.entity.TeachingStaffJoined;

public class SaveClientJoined {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//Teaching staff entity
		TeachingStaffJoined ts1 = new TeachingStaffJoined(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaffJoined ts2 = new TeachingStaffJoined(2, "Manisha", "BSc BEd", "English");
		
		//Non-Teaching Staff entity
		NonTeachingStaffJoined nts1 = new NonTeachingStaffJoined(3 ,"Satish" , "Accounts");
		NonTeachingStaffJoined nts2 = new NonTeachingStaffJoined(4, "Krishna", "Office Admin");
		
		//Storing all entities
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	
	}

}
