package com.mitrais.JPAProj.entity;

import javax.persistence.Entity;

@Entity
public class TeachingStaffTables extends StaffTables {
	private String qualification;
	private String subjectexpertise;
	public TeachingStaffTables(int sid, String sname, String qualification, String subjectexpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}
	public TeachingStaffTables() {
		super();
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubjectexpertise() {
		return subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
	
}
