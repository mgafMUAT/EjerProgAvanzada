package com.mauro.ejerprogavanzada;

import java.util.LinkedHashSet;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String input = "Mildred\nConstance\nLadawn\nBronwyn\nMaisha\nFrance\n"
                + "Myrtle\nOrlando\nAlysha\nRena\nCoralie\nKatie\nKati\nRosy\n"
                + "Vanetta\nJake\nStefan\nJim\nSheridan\nHilary\nPablo\nJazmine\n"
                + "Heidi\nQueenie\nFelicitas\nHelene\nCordelia\nNeal\nRandee\n"
                + "Bette\nWhitney\nScotty\nCasey\nJohnny\nArlen\nMilo\nWilson\n"
                + "Ray\nDorsey\nJeremiah\nTerrance\nRonald\nIvory\nTeodoro\n"
                + "Lorenzo\nVon\nEfrain\nDerrick\nDelbert\nDarius";
        //Idea: La clase Tupla ahora representa personas en una fila, con el texto
        //representando el nombre de la persona, y el nº ya sea el código o la
        //cantidad de un producto que está comprando. La idea es que se mantenga
        //el orden de llegada pero que no se llege a registrar la misma persona
        //más de una vez en la misma fila
        LinkedHashSet<Tupla> tuplas = new LinkedHashSet<Tupla>();
        String[] lista = input.split("\n");
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            Tupla t = new Tupla(r.nextInt(10), lista[r.nextInt(50)]);
            String msg = "Ingresar: " + t;
            System.out.printf("%-25s%s", msg, ((i + 1) % 5 == 0) ? "\n" : " | ");
            tuplas.add(t);
        }
        System.out.println("-------------------");
        int i = 0;
        for (Tupla t : tuplas) {
            System.out.printf("%-15s%s", t, ((++i) % 5 == 0) ? "\n" : " | ");
        }
        if (i % 5 != 0) {
            System.out.println("");
        }
        System.out.println("Tamaño final: " + tuplas.size());
    }
}
