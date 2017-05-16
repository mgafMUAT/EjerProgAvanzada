package com.mauro.ejerprogavanzada;

import java.util.Arrays;

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
        String.split() es usado en gran parte de esta serie de ejercicios para
        obtener un arreglo desde una lista de palabras separadas por \n (nueva
        línea).
        */
        String[] nombres = input.split("\n");
        System.out.println(Arrays.toString(nombres));
        //1ºs 25  separados por comas, el resto en líneas respectivas.
        String[] lista = input.split("\n", 24);
        StringBuilder sb = new StringBuilder(lista[0]);
        for (int i = 1; i < lista.length; i++) {
            sb.append(",").append(lista[i]);
        }
        System.out.println(sb);
    }
}
