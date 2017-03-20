package com.heri.Punto_5;

import java.util.Scanner;

/**
 * Created by heri on 11/03/17.
 */
public class Palabras {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nComparar palabras\n");
        System.out.println("Ingrese La palabra 1: ");

        String palabra1 = sc.nextLine();

        System.out.println("Ingrese La palabra 2: ");

        String palabra2 = sc.nextLine();

        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();

        char[] palabraCiclo;
        char[] palabraMenor;

        if (arrayPalabra1.length > arrayPalabra2.length){

            palabraCiclo = arrayPalabra1;
            palabraMenor = arrayPalabra2;

        }else{

            palabraCiclo = arrayPalabra2;
            palabraMenor = arrayPalabra1;
        }

        for(int i = 0; i <= palabraCiclo.length ; i++ ){


            if (i < palabraMenor.length)
            {
                if(arrayPalabra1[i] == arrayPalabra2[i])
                {
                    System.out.println("¿Letra "+(i + 1)+" igual en las dos palabras? Verdadero");
                }
                else
                {
                    System.out.println("¿Letra "+(i + 1)+" igual en las dos palabras? Falso");
                }
            }
            else if (i > arrayPalabra1.length)
            {
                System.out.println("La palabra 1 no tiene letra "+ i);
            }
            else if (i > arrayPalabra2.length)
            {
                System.out.println("La palabra 2 no tiene letra "+ i);
            }
        }
    }
}


