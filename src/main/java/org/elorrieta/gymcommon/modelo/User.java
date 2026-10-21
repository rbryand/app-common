
package org.elorrieta.gymcommon.modelo;

public class User {

    private String email;
    private int nivel;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;

    public User() {
        this.nivel = 0;
    }

    public User(String email) {
        this.email = email;
        this.nivel = 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return nivel;
    }

    public void setLevel(int level) {
        this.nivel = level;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
