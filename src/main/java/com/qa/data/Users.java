package com.qa.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Users {
	String name;
	String job;
	String id;
	String createdAt;
	String[] abc=new String[1];

	public Users() {
	}

	public Users(String name, String job) {
		this.name = name;
		this.job = job;
		this.abc = abc;
	}
	
	public Users(String name, String job, String[] abc) {
		this.name = name;
		this.job = job;
		this.abc = abc;
	}
	// getters and setters methods:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public void setABC(String[] def) {
		this.abc= def;
	}
	
	public String[] getABC() {
		return abc;
	}

}
