package com.mauro.ejerprogavanzada;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Deque;
import java.util.Random;
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
        Idea: Procesar una lista de personas en una tienda comprando un producto
        representado por un código. Aleatoriamente se atienden personas al frente
        de la lista o abandonan la fila desde el final.
        */
        Random r = new Random();
        ArrayDeque<Tupla> dq = new ArrayDeque<Tupla>();
        for (String in : input.split("\n")) {
            dq.add(new Tupla(r.nextInt(100), in));
        }
        for (int i = 0; i < 20; i++) {
            if (r.nextBoolean()) {
                System.out.println("Se atiende: " + dq.pop());
            } else {
                System.out.println("Abandona la fila: " + dq.poll());
            }
        }
        System.out.println("Fila resultante:");
        for (Tupla tupla : dq) {
            System.out.println(tupla);
        }
    }
}
