package com.mitrais.JPAProj.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "NS" )
public class NonTeachingStaffWeakEntity extends StaffWeakEntity {
	 private String areaexpertise;

	   public NonTeachingStaffWeakEntity( int sid, String sname, String areaexpertise ) {
	      super( sid, sname );
	      this.areaexpertise = areaexpertise;
	   }

	   public NonTeachingStaffWeakEntity( ) {
	      super( );
	   }

	   public String getAreaexpertise( ) {
	      return areaexpertise;
	   }

	   public void setAreaexpertise( String areaexpertise ){
	      this.areaexpertise = areaexpertise;
	   }
}	
