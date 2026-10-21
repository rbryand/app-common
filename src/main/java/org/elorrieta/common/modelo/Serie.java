
package org.elorrieta.common.modelo;

import java.io.Serializable;

public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numero;
    private String nombre;
    private int repeticiones;
    private int duracionSegundos;
    private int descansoSegundos;
    private String imagen;
	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Serie(int numero, String nombre, int repeticiones, int duracionSegundos, int descansoSegundos,
			String imagen) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.repeticiones = repeticiones;
		this.duracionSegundos = duracionSegundos;
		this.descansoSegundos = descansoSegundos;
		this.imagen = imagen;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRepeticiones() {
		return repeticiones;
	}
	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	public int getDuracionSegundos() {
		return duracionSegundos;
	}
	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}
	public int getDescansoSegundos() {
		return descansoSegundos;
	}
	public void setDescansoSegundos(int descansoSegundos) {
		this.descansoSegundos = descansoSegundos;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
