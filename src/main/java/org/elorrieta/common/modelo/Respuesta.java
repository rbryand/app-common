package org.elorrieta.common.modelo;

/** What the server answers. If ok is false, the error says why. */
public class Respuesta {

	private boolean ok;
	private String error;
	private Usuario usuario;

	public Respuesta() {
	}

	public static Respuesta error(String mensaje) {
		Respuesta respuesta = new Respuesta();
		respuesta.ok = false;
		respuesta.error = mensaje;
		return respuesta;
	}

	public boolean isOk() {
		return ok;
	}

	public String getError() {
		return error;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
