package com.heri.Punto_3;

/**
 * Created by heri on 11/03/17.
 */
public class MultiplicadorDieces {

    private Double primerNumero;
    private int segundoNumero;

    public MultiplicadorDieces() {


    }

    public Double multiplicarPorDieces(Double primerNumero, int segundoNumero){

        double elevado = 10.0D, potencia = 0.0D, total = 0.0D;

        potencia = Math.pow(elevado,segundoNumero);

        //System.out.println(potencia);

        total = primerNumero * potencia;

        //System.out.println(total);

        return total;
    }

}
