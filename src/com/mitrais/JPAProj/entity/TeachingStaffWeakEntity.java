package com.mitrais.JPAProj.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value="TS" )
public class TeachingStaffWeakEntity extends StaffWeakEntity {
	private String qualification;
	   private String subjectexpertise;

	   public TeachingStaffWeakEntity( int sid, String sname, 
	   
	   String qualification,String subjectexpertise ) {
	      super( sid, sname );
	      this.qualification = qualification;
	      this.subjectexpertise = subjectexpertise;
	   }

	   public TeachingStaffWeakEntity( ) {
	      super( );
	   }

	   public String getQualification( ){
	      return qualification;
	   }

	   public void setQualification( String qualification ){
	      this.qualification = qualification;
	   }

	   public String getSubjectexpertise( ) {
	      return subjectexpertise;
	   }

	   public void setSubjectexpertise( String subjectexpertise ){
	      this.subjectexpertise = subjectexpertise;
	   }
}
