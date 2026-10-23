package org.elorrieta.gymcommon.modelo;

import java.io.Serializable;

/*
 * Copyright 2026 nombreGrupoDam
 */

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private String email;
	private String contrasena;
	private String fechaNacimiento;
	private int nivel;

	public Usuario() {
	}

	public Usuario(String nombre, String apellidos, String email, String contrasena, String fechaNacimiento,
			int nivel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaNacimiento = fechaNacimiento;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
 
 
}