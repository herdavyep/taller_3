package com.heri.Punto_1;

import java.sql.Time;
import java.util.Date;

/**
 * Created by heri on 9/03/17.
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public Estudiante(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreCompleto(String nombreCompleto){

        this. nombre = nombreCompleto;

    }

    public void getNombreCompleto() {

        System.out.println(this.nombre+" "+this.apellido);
    }

    public void getFechaNacimiento() {

        System.out.println(this.fechaNacimiento);

    }

    public void setFechaNacimiento(String fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;

    }





}
