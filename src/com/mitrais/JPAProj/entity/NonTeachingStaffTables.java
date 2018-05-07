package com.mitrais.JPAProj.entity;

import javax.persistence.Entity;

@Entity
public class NonTeachingStaffTables extends StaffTables {
	private String areaexpertise;

	public NonTeachingStaffTables(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaffTables() {
		super();
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	
}
