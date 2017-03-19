package com.heri.Punto_4;

/**
 * Created by heri on 11/03/17.
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;

    public Profesor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Profesor() {

        this.nombre = "nombre";
        this.apellido = "apellido";
        this.edad = 0;
        this.casado = false;
        this.especialista = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getApellido() {
        System.out.println(""+apellido);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void getEdad() {
        System.out.println(""+edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void isCasado() {

        if (casado){

            System.out.println("si");

        }else {

            System.out.println("no");

        }
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void isEspecialista() {

        if (especialista){

            System.out.println("si");

        }else {

            System.out.println("no");

        }
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
}
