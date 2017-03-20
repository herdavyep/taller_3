package com.heri.Punto_2;

import java.util.Scanner;

/**
 * Created by heri on 11/03/17.
 */
public class Carro {

    private String marca;
    private String modelo;
    private float consumoGasolina;
    private float kilometraje;
    private float gasolina;
    private boolean movimiento;
    private float velocidad;
    private boolean luces = false;

    public Carro(String marca, String modelo, float consumoGasolina, float kilometraje, float gasolina, boolean movimiento, float velocidad, boolean luces) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoGasolina = consumoGasolina;
        this.kilometraje = kilometraje;
        this.gasolina = gasolina;
        this.movimiento = movimiento;
        this.velocidad = velocidad;
        this.luces = luces;
    }

    public void getModelo() {
        System.out.println(""+modelo);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void Arrancar(Carro sparck){

        if (sparck.gasolina <= 0){

            System.out.println("El carro no tiene gasolina");

        }else if (sparck.movimiento){

            System.out.println("El carro ya esta en movimiento");

        }else {

            System.out.println("\nrun run ruuuuuuuuuuuunnnnnnnn");

        }

    }

    public static void Frenar(Carro ferrari){

        String palabra;
        Scanner sc = new Scanner(System.in);


        if (ferrari.velocidad <= 0 ){

            System.out.println("el auto esta parado");
        }else {

            while (ferrari.velocidad > 0){

                //System.out.println("La velocidad es = "+ferrari.velocidad);

                Carro.getEstadoCarro(ferrari);

                System.out.println("digite 'si' para frenar, 'no' para seguir");

                palabra = sc.nextLine();

                if (palabra.equals("si")){

                    ferrari.velocidad = ferrari.velocidad - 20;

                }
                if (ferrari.velocidad <= 0){

                    System.out.println("ya esta parado el carro");
                }
            }
        }
    }

    public static void Acelerar(Carro mercedez){

        String palabra;
        Scanner sc = new Scanner(System.in);

        if (mercedez.gasolina <= 0){

            System.out.println("El carro no tiene gasolina");

        }else if (mercedez.velocidad >= 0){

            while (mercedez.gasolina > 0){

                /*System.out.println("El kilometraje es = "+mercedez.kilometraje);
                System.out.println("Gasolina restante = "+mercedez.gasolina);*/

                Carro.getEstadoCarro(mercedez);

                System.out.println("desea acelerar 'si' o 'no' ");

                palabra = sc.nextLine();

                if (palabra.equals("si")){

                    mercedez.kilometraje = mercedez.kilometraje + 10;
                    mercedez.gasolina = mercedez.gasolina - 20;
                }
                if (mercedez.gasolina <= 0){

                    System.out.println("El carro ya se quedo sin gasolina");
                }
            }

        }else {

            System.out.println("El carro no ha arrancado");
        }
    }

    public static void getEstadoCarro(Carro lamborgini){

        System.out.println("La velocidad es = "+lamborgini.velocidad);
        System.out.println("La gasolina restante es = "+lamborgini.gasolina);
        System.out.println("El kilometraje es = "+lamborgini.kilometraje);

        if (lamborgini.luces){

            System.out.println("las luces estan encendidas");

        }else {

            System.out.println("Las luces estan apagadas");

        }
    }

    public static void EncenderLuces(Carro twingo){

        String palabra;
        Scanner sc = new Scanner(System.in);

        if (twingo.luces){

            System.out.println("las luces estan encendidas ¿desea apargarlas si/no");

            palabra = sc.nextLine();

            if (palabra.equals("si")){

                twingo.luces = false;
                System.out.println("se encendieron las luces");

            }

        }else {

            System.out.println("las luces estan apagadas ¿desea encenderlas si/no");
            palabra = sc.nextLine();
            if (palabra.equals("si")){

                twingo.luces = true;
                System.out.println("se apagaron las luces");


            }

        }


    }

}
