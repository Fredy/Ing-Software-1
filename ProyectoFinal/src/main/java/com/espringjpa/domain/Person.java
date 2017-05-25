package com.espringjpa.domain;
import java.util.Date;

public abstract class Person {
	protected String name;
	protected boolean gender;
	protected String userName;
	protected String password;
	protected Date signedInDate;
	protected boolean active;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getGender() {
		return this.gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDate() {
		return this.signedInDate;
	}
	
	public boolean isActive() {
		return this.active;
	}
	
	public void activateAccount() {
		this.active = true;
	}
	
	public void deactivateAccount() {
		this.active = false;
	}
}
