package com.heri.Punto_2;

/**
 * Created by heri on 11/03/17.
 */
public class RunCarro {

    public static void main(String[] args) {

        Carro carrito = new Carro("toyota","corolla",29,20006,43,false,200,false);
        Carro carrito2 = new Carro("toyota","corolla",29,20006,43,false,200,true);
        Carro carrito3 = new Carro("toyota","corolla",29,20006,43,false,200,true);

        /*Carro.Arrancar(carrito);
        Carro.Frenar(carrito2);
        Carro.Acelerar(carrito3);
        Carro.getEstadoCarro(carrito);*/

        Carro.EncenderLuces(carrito);
        Carro.EncenderLuces(carrito2);



    }
}
