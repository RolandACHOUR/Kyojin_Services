package com.ks.laboratory.model;

import java.util.ArrayList;

public class Researcher {
	
	private int id;
	private String resFirstName;
	private String resLastName;
	private int resAge;

	

	public int getId() { return id; }
	
	public String getResFirstName() { return resFirstName; }
	
	public String getResLastName() { return resLastName; }
	
	public int getResAge() { return resAge; }
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setResFirstName(String resFirstName) {
		this.resFirstName = resFirstName;
	}
	
	public void setResLastName(String resLastName) {
		this.resLastName = resLastName;
	}
	
	public void setResAge(int resAge) {
		this.resAge = resAge;
	}
	
}