package com.springjpa.domain;
import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;

	protected String name;
	protected boolean gender;
	protected String userName;
	protected String password;
	protected Date signedInDate;
	protected boolean active;

	public Person(String name, boolean gender, String userName,
				  String password, Date signedInDate) {
		this.name = name;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.signedInDate = signedInDate;
		this.active = true;
	}

	public Person() { }

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
