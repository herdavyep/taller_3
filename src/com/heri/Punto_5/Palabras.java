package com.heri.Punto_5;

import java.util.Scanner;

/**
 * Created by heri on 11/03/17.
 */
public class Palabras {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparar palabras");
        System.out.println("Ingrese La palabra 1: ");

        String palabra1 = sc.nextLine();

        System.out.println("Ingrese La palabra 2: ");

        String palabra2 = sc.nextLine();

        char[] CharPalabra1 = palabra1.toCharArray();
        char[] CharPalabra2 = palabra2.toCharArray();
        char[] PalabraCiclo;
        char[] PalabraMenor;

        if (CharPalabra1.length > CharPalabra2.length){
            PalabraCiclo = CharPalabra1;
            PalabraMenor = CharPalabra2;
        }else{
            PalabraCiclo = CharPalabra2;
            PalabraMenor = CharPalabra1;
        }

        for(int x=0 ; x <= PalabraCiclo.length ; x++ ){


            if (x < PalabraMenor.length)
            {
                if(CharPalabra1[x] == CharPalabra2[x])
                {
                    System.out.println("¿Letra "+(x+1)+" igual en las dos palabras? Verdadero");
                }
                else
                {
                    System.out.println("¿Letra "+(x+1)+" igual en las dos palabras? Falso");
                }
            }
            else if (x > CharPalabra1.length)
            {
                System.out.println("La palabra 1 no tiene letra "+x);
            }
            else if (x > CharPalabra2.length)
            {
                System.out.println("La palabra 2 no tiene letra "+x);
            }
        }
    }
}


