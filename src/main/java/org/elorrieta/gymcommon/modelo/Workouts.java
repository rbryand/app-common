package org.elorrieta.gymcommon.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Workouts implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Workout> workouts;

    public Workouts() {
		this.workouts = new ArrayList<>();
    }

    public Workouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public void addWorkout(Workout workout) {
        this.workouts.add(workout);
    }

    
 
    /**
     * Filtra los workouts exactamente por un nivel concreto 
     * (Requisito: Filtro disponible para el usuario).
     */
    public Workouts filtrarPorNivelEspecifico(int nivel) {
        List<Workout> resultado = new ArrayList<>();
        Workouts filtrados;
        for (Workout w : workouts) {
            if (w.getNivel() == nivel) {
                resultado.add(w);
            }
        }
        
        filtrados= new Workouts(resultado);
        return filtrados;
    }
    
    public Workouts filtrarHastaNivel(int nivel) {
        List<Workout> resultado = new ArrayList<>();
        Workouts filtrados;

        for (Workout w : workouts) {
            if (w.getNivel() <= nivel) {
                resultado.add(w);
            }
        }

        filtrados = new Workouts(resultado);
        return filtrados;
    }
    
    
}
