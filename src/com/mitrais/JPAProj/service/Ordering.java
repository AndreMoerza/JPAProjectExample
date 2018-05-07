package com.mitrais.JPAProj.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mitrais.JPAProj.entity.Employee;

public class Ordering {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		//Between
		Query query = entitymanager.createQuery("select e " + " from Employee e " + "order by e.ename ASC");
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		for(Employee e:list)
		{
			System.out.println("Employee ID :" + e.getEid());
			System.out.println("\t Employee Name :" + e.getEname());
		}
	}

}
