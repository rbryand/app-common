package org.elorrieta.common.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Workout implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nombre;
	private String descripcion;
	private int nivel;
	private String imagen;
	private String videoUrl; // URL del video informativo
	private List<Ejercicio> ejercicios;

	public Workout() {
		this.ejercicios = new ArrayList<>();
	}

	public Workout(String id, String nombre, int nivel, String videoUrl) {
		this.id = id;
		this.nombre = nombre;
		this.nivel = nivel;
		this.videoUrl = videoUrl;
		this.ejercicios = new ArrayList<>();
	}

	public int getNumeroEjercicios() {
		return ejercicios != null ? ejercicios.size() : 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public List<Ejercicio> getEjercicios() {
		return ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}