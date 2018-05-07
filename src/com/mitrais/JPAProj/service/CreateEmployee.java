package com.mitrais.JPAProj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mitrais.JPAProj.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAProj" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEid( 1202 );
	      employee.setEname( "Manisha" );
	      employee.setSalary( 40000 );
	      employee.setDeg( "Proof Reader" );
	      
	      entitymanager.persist( employee );

	      Employee employee1 = new Employee( ); 
	      employee1.setEid( 1203 );
	      employee1.setEname( "Masthanvali" );
	      employee1.setSalary( 40000 );
	      employee1.setDeg( "Technical Writer" );
	      
	      entitymanager.persist( employee1 );
	      
	      Employee employee2 = new Employee( ); 
	      employee2.setEid( 1204 );
	      employee2.setEname( "Satish" );
	      employee2.setSalary( 30000 );
	      employee2.setDeg( "Technical Writer" );
	      
	      entitymanager.persist( employee2 );
	      
	      Employee employee3 = new Employee( ); 
	      employee3.setEid( 1205 );
	      employee3.setEname( "Krishna" );
	      employee3.setSalary( 30000 );
	      employee3.setDeg( "Technical Writer" );
	      
	      entitymanager.persist( employee3 );
	      
	      Employee employee4 = new Employee( ); 
	      employee4.setEid( 1206 );
	      employee4.setEname( "Kiran" );
	      employee4.setSalary( 35000 );
	      employee4.setDeg( "Proof Reader" );
	      
	      entitymanager.persist( employee4 );
	      entitymanager.getTransaction( ).commit( );
	      
	      entitymanager.close( );
	      emfactory.close( );
	}

}
