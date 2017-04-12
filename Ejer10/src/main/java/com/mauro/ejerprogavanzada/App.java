package com.mauro.ejerprogavanzada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

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
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList(input.split("\n")));
        System.out.println(lista);
        //Crea una copia de la lista
        ArrayList<String> lista2 = (ArrayList<String>) lista.clone();
        //Ordena esta lista y la imprime
        Collections.sort(lista2);
        System.out.println(lista2);
        //Ejercicio: Crear métodos especializados para contar el nº de palabras
        //que comienzan con una determinada letra; en este caso, 'm'.
        //Se cronometra cada operación en milisegundos
        Calendar start = Calendar.getInstance();
        System.out.println(contarPorLetra(lista, 'm'));
        Calendar end = Calendar.getInstance();
        System.out.println((end.getTimeInMillis()-start.getTimeInMillis()));
        start = Calendar.getInstance();
        System.out.println(contarPorLetra2(lista2, 'm'));
        end = Calendar.getInstance();
        System.out.println((end.getTimeInMillis()-start.getTimeInMillis()));
    }

    public static int contarPorLetra(ArrayList<String> lista, char c) {
        int cont = 0;
        for (String word : lista) {
            if (word.charAt(0) == c) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarPorLetra2(ArrayList<String> lista2, char c) {
        int cont = 0, i = 0;
        try {
            while (lista2.get(i).charAt(0) != c) {
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
        for (int j = i; j < lista2.size(); j++) {
            if (lista2.get(i).charAt(0) == c) {
                cont++;
            } else {
                break;
            }
        }
        return cont;
    }
}
