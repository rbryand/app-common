package org.elorrieta.common.modelo;

/** Data sent to the server to create a new user */
public class Registro {

	private final String nombre;
	private final String apellidos;
	private final String email;
	private final String contrasena;
	private final String fechaNacimiento;

	public Registro(String nombre, String apellidos, String email, String contrasena, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEmail() {
		return email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
}
