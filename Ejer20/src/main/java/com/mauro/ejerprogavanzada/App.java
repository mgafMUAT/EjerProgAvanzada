package com.mauro.ejerprogavanzada;

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
        /*
        Idea: Procesar una lista de nombres que se concatenan al StringBuilder
        en orden aleatorio y con duplicados. Se tienen 50 nombres, de los cuales
        se procesan máximo 40.
        */
        Random r = new Random();
        String[] nombres = input.split("\n");
        StringBuilder sb = new StringBuilder(nombres[r.nextInt(50)]);
        for (int i = 0; i < 40; i++) {
            sb.append(" -> ").append(nombres[r.nextInt(50)]);
        }
        System.out.println(sb);
    }
}
