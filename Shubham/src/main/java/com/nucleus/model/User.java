package com.nucleus.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="User_BRD")
public class User 
{
	@Id
	private int username;
	private int userPassword;
	@ManyToOne(cascade=CascadeType.ALL)
	private Role role;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userPassword=" + userPassword
				+ ", role=" + role + "]";
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
