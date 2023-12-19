package com.CMEPPS.listatareas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hours")
public class Hours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String Username;
	private long hours;
	public Hours(long id, String username, long hours) {
		super();
		this.id = id;
		Username = username;
		this.hours = hours;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public long getHours() {
		return hours;
	}
	public void setHours(long hours) {
		this.hours = hours;
	}
}
