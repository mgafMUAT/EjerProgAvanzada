package com.mauro.ejerprogavanzada;

import java.util.regex.Matcher;
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
        Aplicación simple: Encontrar las ocurrencias de un patrón vocal-consonante
        -vocal
        */
        String lista = input.replace("\n", "").toLowerCase();
        Matcher m = Pattern.compile("[aeiou][^aeiou][aeiou]").matcher(lista);
        for (int i = 1; m.find(); i++) {
            System.out.printf("Ocurrencia %d en posición %d%s", i, m.start(), "\n");
        }
    }
}
