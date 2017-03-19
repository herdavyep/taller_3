package com.heri.Punto_2;

/**
 * Created by heri on 11/03/17.
 */
public class Carro {

    private String marca;
    private String modelo;
    private float consumoGasolina;
    private float kilometraje;
    private float gasolina;
    private boolean movimiento = false;
    private float velocidad;
    private boolean luces = false;

    public Carro(String marca, String modelo, float consumoGasolina, float kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoGasolina = consumoGasolina;
        this.kilometraje = kilometraje;
    }

    public void getModelo() {
        System.out.println(""+modelo);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
