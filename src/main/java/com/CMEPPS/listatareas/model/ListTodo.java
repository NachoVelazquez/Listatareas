package com.CMEPPS.listatareas.model;

import java.util.List;

import javax.persistence.*;
@Entity
public class ListTodo {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String nombre;
private List<String> Todos;
private String descripcion;



public ListTodo(int id, String nombre, List<String> todos, String descripcion) {
	super();
	this.id = id;
	this.nombre = nombre;
	Todos = todos;
	this.descripcion = descripcion;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public List<String> getTodos() {
	return Todos;
}
public void setTodos(List<String> todos) {
	Todos = todos;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



}
