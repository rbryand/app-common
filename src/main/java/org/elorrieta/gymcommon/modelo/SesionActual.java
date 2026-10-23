package org.elorrieta.gymcommon.modelo;

import java.io.Serializable;

public class SesionActual implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int workoutId;
    private int ejercicioActual;
    private int serieActual;
    private int segundosRestantes;
    private int tiempoEjercicio;
    private String estado;
    private String fechaActualizacion;
    private int seriesCompletadas;

    public int getSeriesCompletadas() {
		return seriesCompletadas;
	}

	public void setSeriesCompletadas(int seriesCompletadas) {
		this.seriesCompletadas = seriesCompletadas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SesionActual() {
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public int getEjercicioActual() {
        return ejercicioActual;
    }

    public void setEjercicioActual(int ejercicioActual) {
        this.ejercicioActual = ejercicioActual;
    }

    public int getSerieActual() {
        return serieActual;
    }

    public void setSerieActual(int serieActual) {
        this.serieActual = serieActual;
    }

    public int getSegundosRestantes() {
        return segundosRestantes;
    }

    public void setSegundosRestantes(int segundosRestantes) {
        this.segundosRestantes = segundosRestantes;
    }

    public int getTiempoEjercicio() {
        return tiempoEjercicio;
    }

    public void setTiempoEjercicio(int tiempoEjercicio) {
        this.tiempoEjercicio = tiempoEjercicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    
}



