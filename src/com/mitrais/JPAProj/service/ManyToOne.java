package com.mitrais.JPAProj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitrais.JPAProj.entity.DepartmentManyToOne;
import com.mitrais.JPAProj.entity.Employee;
import com.mitrais.JPAProj.entity.EmployeeManyToOne;

public class ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAProj");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//Create Department Entity
		DepartmentManyToOne department = new DepartmentManyToOne();
		department.setName("Development");
		
		//Store Department
		entitymanager.persist(department);
		
		//Create Employee1 Entity
		EmployeeManyToOne employee1 = new EmployeeManyToOne();
		employee1.setEname("Satish");
		employee1.setSalary(45000.0);
		employee1.setDeg("Technical Writer");
		employee1.setDepartment(department);
		
		//Create Employee2 Entity
		EmployeeManyToOne employee2 = new EmployeeManyToOne();
		employee2.setEname("Krishna");
		employee2.setSalary(45000.0);
		employee2.setDeg("Technical Writer");
		employee2.setDepartment(department);
		
		//Create Employee2 Entity
		EmployeeManyToOne employee3 = new EmployeeManyToOne();
		employee3.setEname("Masthanvali");
		employee3.setSalary(50000.0);
		employee3.setDeg("Technical Writer");
		employee3.setDepartment(department);
		
		//Store employees
		entitymanager.persist(employee1);
		entitymanager.persist(employee2);
		entitymanager.persist(employee3);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
