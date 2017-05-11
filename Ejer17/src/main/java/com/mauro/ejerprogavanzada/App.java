package com.mauro.ejerprogavanzada;

import java.util.Stack;

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
        Idea: Añadir los nombres junto a sus índices a la pila, quitar de los
        últimos 25 aquellos cuyos nombres sean más cortos que 6 letras.
        */
        Stack<Tupla> tuplas = new Stack<Tupla>();
        Stack<Tupla> largos = new Stack<Tupla>();
        String[] lista = input.split("\n");
        for (int i = 0; i < 50; i++) {
            Tupla t = new Tupla(i, lista[i]);
            String msg = "Ingresar: " + t;
            System.out.printf("%-25s%s", msg, ((i + 1) % 5 == 0) ? "\n" : " | ");
            tuplas.push(t);
        }
        System.out.println("-------------------");
        for (int i = 0; i < 25; i++) {
            Tupla pop = tuplas.pop();
            if (pop.getDt2().length() > 5) {
                largos.add(pop);
            } else {
                System.out.println("Eliminando: " + pop);
            }
        }
        while (!largos.empty()) {
            tuplas.push(largos.pop());
        }
        int i = 0;
        System.out.println("-------------------");
        for (Tupla t : tuplas) {
            System.out.printf("%-15s%s", t, ((++i) % 5 == 0) ? "\n" : " | ");
        }
        if (i % 5 != 0) {
            System.out.println("");
        }
        System.out.println("Tamaño final: " + tuplas.size());
    }
}
