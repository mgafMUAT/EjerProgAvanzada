package com.mauro.ejerprogavanzada;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
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
        Idea: Procesar la lista de nombres en una fila prioritaria ordenado por 
        el índice de la tupla, seguido del orden alfabético inverso
        */
        Random r = new Random();
        PriorityQueue<Tupla> pq = new PriorityQueue<Tupla>();
        for (String in : input.split("\n")) {
            pq.offer(new Tupla(r.nextInt(25), in));
        }
        System.out.println("Atendiendo:");
        for (Iterator<Tupla> it = pq.iterator(); it.hasNext();) {
            System.out.println(pq.poll());
        }
    }
}
