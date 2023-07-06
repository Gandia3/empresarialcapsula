package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creando objetos
        Samurai samurai=new Samurai();
        Samurai samuraiDos=new Samurai();
        Herramienta herramienta=new Herramienta("escopeta",90.0);
        Herramienta herramientaDos= new Herramienta();
        Scanner entradaPorteclado= new Scanner(System.in);

        //Creo los objetos para poder utilizar-accerder-ver-modificar-operar-revisar-validar
        // los atributos y metodos de una clase
        samurai.setNombres("Titan");
        System.out.print("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorteclado.nextInt());

        System.out.print("********RESULTADOS********");
        System.out.print("El samurai "+ samurai.getNombres()+ " Tiene: "+samurai.getEdad());


    }
}