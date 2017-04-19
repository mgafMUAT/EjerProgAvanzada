package com.mauro.ejerprogavanzada;

import java.util.HashSet;
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
        //Idea: Crear un set de Tuplas donde el los objetos se consideran iguales
        //si y sólo si sus atributos coinciden
        HashSet<Tupla> tuplas = new HashSet<Tupla>(400);
        String[] list = input.split("\n");
        Random r = new Random();
        for (int i = 0; i < 400; i++) {
            Tupla t = new Tupla(r.nextInt(100), list[i % 100]);
            String msg = "Ingresar: " + t;
            System.out.printf("%-30s%s", msg, ((i + 1) % 5 == 0) ? "\n" : " | ");
            tuplas.add(t);
        }
        int i = 0;
        for (Tupla t : tuplas) {
            System.out.printf("%-20s%s", t, ((++i) % 5 == 0) ? "\n" : " | ");
        }
        if (i % 5 != 0) {
            System.out.println("");
        }
        System.out.println("Tamaño final: " + tuplas.size());
    }
}
