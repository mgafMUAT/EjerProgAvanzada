package com.mauro.ejerprogavanzada;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

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
        /*
        Idea: Procesar la lista de nombres an un TreeMap que visualize la
        longitud de los nombres, mostrando el último nombre procesado del su
        respectivo largo.
        */
        TreeMap<Integer,String> tm = new TreeMap();
        for (String in : input.split("\n")) {
            tm.put(in.length(), in);
        }
        Stack<Tupla> tuplas = new Stack<Tupla>();
        for (Map.Entry<Integer,String> ent : tm.entrySet()) {
            tuplas.push(new Tupla(ent.getKey(), ent.getValue()));
        }
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
