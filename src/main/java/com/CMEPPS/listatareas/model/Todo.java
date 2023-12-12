/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CMEPPS.listatareas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NamedQueries({ @NamedQuery(name = "Todo.findByTime", query = "SELECT t FROM Todo t WHERE t.duration <:name") })
	private long id;

	private String UserName;
	private String Name;
	private String description;
	private int duration;
	private int priority;
	private int idlist;

	public Todo(long id, String UserName, String Name, String description, int duration, int priority, int idlist) {
		this.id = id;
		this.UserName = UserName;
		this.Name = Name;
		this.description = description;
		this.duration = duration;
		this.priority = priority;
		this.idlist = idlist;
	}

	public Todo() {
		super();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getIdlist() {
		return idlist;
	}

	public void setIdlist(int idlist) {
		this.idlist = idlist;
	}

}