package org.elorrieta.gymcommon.modelo;

/** Data sent to the server to log in */
public class Login {

	private final String email;
	private final String contrasena;

	public Login(String email, String contrasena) {
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public String getContrasena() {
		return contrasena;
	}
}
