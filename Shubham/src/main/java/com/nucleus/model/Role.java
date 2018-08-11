package com.nucleus.model;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Role 
{
	@Id	
	private String description;
	private int enabled;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "Role [description=" + description + ", enabled=" + enabled
				+ "]";
	}
	
	
	

}
