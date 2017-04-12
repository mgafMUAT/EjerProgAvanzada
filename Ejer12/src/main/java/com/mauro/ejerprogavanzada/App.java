package com.mauro.ejerprogavanzada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String input = "rightful\ngirl\nirate\nhospital\nsick\nflippant\ncook\n"
                + "lace\nahead\ntransport\nwait\ntreat\nkill\ncapable\nmoon\n"
                + "nostalgic\nrace\nphysical\ncultured\nperpetual\nalarm\n"
                + "zipper\nbawdy\nfish\nfireman\nunite\nsnails\npetite\nlocket\n"
                + "steer\nwrench\npancake\nsin\nbook\nask\nugliest\ntoothpaste\n"
                + "harmonious\nwakeful\nyell\noptimal\ncrowded\nneck\nmaniacal\n"
                + "vigorous\nsail\nharass\nlake\nhapless\nheavy\ndependent\n"
                + "pink\navailable\nstream\ntasty\nexpand\nmoan\nharm\nimprove\n"
                + "self\nsong\nblot\nmomentous\nminister\ndream\nrepresentative\n"
                + "motion\nbox\ndidactic\nquick\norange\ndad\npathetic\ngrowth\n"
                + "trees\nface\ncycle\nrhetorical\nwobble\npricey\nshop\nfretful\n"
                + "omniscient\nadamant\nberry\nroot\nbikes\njoyous\ncast\nacrid\n"
                + "forgetful\nflavor\nvoice\nqueue\nprogram\nsolid\ndelirious\n"
                + "hole\ndesert\ncause";
        //Idea: usar Comparablr en una clase Tupla compuesta de un int y un String
        //Con prioridad de orden sobre la 1ª letra del String, luego en el entero.
        ArrayList<Tupla> tuplas = new ArrayList<Tupla>();
        java.util.Random rand = new Random();
        for (String split : input.split("\n")) {
            tuplas.add(new Tupla(rand.nextInt(200), split));
        }
        for (int i = 0; i < tuplas.size(); i++) {
            System.out.printf("%-20s",tuplas.get(i));
            System.out.print(((i+1)%8 == 0)?"\n":" ");
        }
        System.out.println("\n");
        Collections.sort(tuplas);
        for (int i = 0; i < tuplas.size(); i++) {
            System.out.printf("%-20s",tuplas.get(i));
            System.out.print(((i+1)%8 == 0)?"\n":" ");
        }
    }
}
