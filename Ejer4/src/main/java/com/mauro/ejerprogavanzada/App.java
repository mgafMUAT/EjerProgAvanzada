package com.mauro.ejerprogavanzada;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {

    //Lista c/ varios objetos
    private static ArrayList lista = new ArrayList();
    //Lista para números
    private static ArrayList<Number> numeros = new ArrayList<Number>();

    public static void main(String[] args) {
        //Las clases Integer, Float, Double, Long son hijas de la clase Number,
        //con esto creo un ejemplo basado en el del video que separa números de
        //texto (String), sin necesidad de crear clases extra
        //OJO: Utilizo la creación de instancias de objetos de números porque el
        //instanceof no funciona con objetos primitivos (int, float, en minúscula)
        lista.add(new Integer(3));
        lista.add(new Float(-4.29));
        lista.add("23456789");
        lista.add(new Long(987652424));
        lista.add(new Double(1.0 / 3.0));
        lista.add("qwertyuiop");
        lista.add(new Integer(20480));
        System.out.println("Separando números de Strings...");
        clasificar();
        System.out.println("Listo");
        System.out.println("Resultado: Números encontrados:");
        verNumeros();
    }

    public static void clasificar() {
        for (Object obj : lista) {
            if (obj instanceof Number) {
                numeros.add((Number) obj);
            } else {
                System.out.println("Texto identificado: " + obj);
            }
        }
    }

    public static void verNumeros() {
        for (Number numero : numeros) {
            System.out.println(numero);
        }
    }
}
