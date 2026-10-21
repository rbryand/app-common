package org.elorrieta.common.modelo;
/*
 * Copyright 2026 nombreGrupoDam
 */


public class Usuario {

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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getContrasenaHash() {
		return contrasena;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", contrasena="
				+ contrasena + ", fechaNacimiento=" + fechaNacimiento + ", nivel=" + nivel + "]";
	}
	
	
}