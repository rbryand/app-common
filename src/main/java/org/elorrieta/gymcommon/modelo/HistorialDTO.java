package org.elorrieta.gymcommon.modelo;

public class HistorialDTO {
	private int ejerciciosCompletados;
	private String estado;
	private String fecha;
	private String id;
	private int nivel;
	private String nombreWorkout;
	private int porcentajeCompletado;
	private int tiempoPrevisto;
	private int tiempoReal;
	private int workoutId;	
	private int totalEjercicios;


	public HistorialDTO() {
		// is empty because is serializable object
	}

	public int getEjerciciosCompletados() {
		return ejerciciosCompletados;
	}

	public void setEjerciciosCompletados(int ejerciciosCompletados) {
		this.ejerciciosCompletados = ejerciciosCompletados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombreWorkout() {
		return nombreWorkout;
	}

	public void setNombreWorkout(String nombreWorkout) {
		this.nombreWorkout = nombreWorkout;
	}

	public int getPorcentajeCompletado() {
		return porcentajeCompletado;
	}

	public void setPorcentajeCompletado(int porcentajeCompletado) {
		this.porcentajeCompletado = porcentajeCompletado;
	}

	public int getTiempoPrevisto() {
		return tiempoPrevisto;
	}

	public void setTiempoPrevisto(int tiempoPrevisto) {
		this.tiempoPrevisto = tiempoPrevisto;
	}

	public int getTiempoReal() {
		return tiempoReal;
	}

	public void setTiempoReal(int tiempoReal) {
		this.tiempoReal = tiempoReal;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}
	
	
	

	public int getTotalEjercicios() {
		return totalEjercicios;
	}

	public void setTotalEjercicios(int totalEjercicios) {
	    this.totalEjercicios = totalEjercicios;
	}
	
	
}
