
package org.elorrieta.gymcommon.modelo;

import java.util.ArrayList;

public class Ejercicio {

	private int id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int tiempo;
	private ArrayList<Serie> series = new ArrayList<>();

	public Ejercicio() {
	}

	public Ejercicio(int id, String nombre, String descripcion, String imagen, ArrayList<Serie> series) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		setSeries(series);
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

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public ArrayList<Serie> getSeries() {
		return series;
	}

	public void setSeries(ArrayList<Serie> series) {
		if (series != null) {
			this.series = series;
		} else {
			this.series = new ArrayList<>();
		}
	}

	public void anadirSerie(Serie serie) {
		series.add(serie);
	}

	public Serie obtenerSerie(int posicion) {
		Serie serie = null;

		if (posicion >= 0 && posicion < series.size()) {
			serie = series.get(posicion);
		}

		return serie;
	}

	public int getNumeroSeries() {
		return series.size();
	}
	
	@Override
	public String toString() {
	    return nombre;
	}
}
