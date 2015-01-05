package com.jesse.admin.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AUser {
	@Id
	private int id;
	private String aUsername;
	private String aPassword;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getaUsername() {
		return aUsername;
	}

	public void setaUsername(String aUsername) {
		this.aUsername = aUsername;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}

}
