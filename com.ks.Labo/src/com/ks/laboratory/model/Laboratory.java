package com.ks.laboratory.model;

import java.util.ArrayList;

public class Laboratory {
	
	private int labId;
	private String labName;
	private int numberOfMembers = 0;
	
	public int getId() { return labId; }
	
	public String getLabName() { return labName; }
		
	public int getNumberOfMembers() { return numberOfMembers; }
		
	public void setId(int id) {
		this.labId = id;
	}
	
	public void setLabName(String labName) {
		this.labName = labName;
	}
	
	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

}