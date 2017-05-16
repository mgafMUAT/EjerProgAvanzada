package com.mauro.ejerprogavanzada;

import java.util.Arrays;
import java.util.regex.Pattern;

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
        Aplicación simple: Separar la lista de caracteres en donde exista un
        patrón vocal-consonante-vocal
        */
        String lista = input.replace("\n", "").toLowerCase();
        Pattern p = Pattern.compile("[aeiou][^aeiou][aeiou]");
        for (String elem : p.split(lista)) {
            System.out.println(elem);
        }
    }
}
