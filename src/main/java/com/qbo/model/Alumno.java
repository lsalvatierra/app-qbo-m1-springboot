package com.qbo.model;

public class Alumno {

	Integer id;
	String nombre;
	String apellido;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String nombreApellido() {
		return this.nombre + " " + this.apellido;
	}
	
	
}
