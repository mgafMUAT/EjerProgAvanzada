package com.mauro.ejerprogavanzada;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //Cronometrar el agregado de 100 palabras en dos ArrayList de distintas
        //capacidades iniciales
        String input = "keen\nwiggly\nsavory\nsurprise\ninstrument\ntense\n"
                + "song\naverage\npartner\nlist\nhard-to-find\ncarry\njoin\n"
                + "judicious\naccidental\ninstinctive\npine\noval\nvoiceless\n"
                + "sick\npetite\ninject\nimpartial\ntempt\nstingy\nmiss\n"
                + "miniature\nsordid\nproduce\nexpert\ncushion\ntedious\n"
                + "burn\nroasted\ninfamous\nversed\nstreet\ntow\nabortive\n"
                + "poor\npump\nbrainy\ndisgusting\nhobbies\ngiants\ndepend\n"
                + "juice\nhonorable\nnaughty\npuny\nluxuriant\nchallenge\n"
                + "church\ncompany\nselection\nmatter\nembarrass\nfixed\n"
                + "impress\nobservant\nprepare\ninfluence\nregular\ndescribe\n"
                + "scintillating\npretend\nunused\nland\njam\nimportant\nguitar\n"
                + "known\nundesirable\nadhesive\nintroduce\nnail\nsponge\n"
                + "chilly\nworry\nhumorous\nwine\ncomfortable\nwhip\nwise\n"
                + "fabulous\ntitle\nball\nboil\nthoughtless\nrod\ntrains\n"
                + "butter\nwandering\naromatic\nescape\nelbow\nmoldy\ndeliver\n"
                + "twig\nscarf";
        String[] list = input.split("\n");
        ArrayList<String> dictado1 = new ArrayList<String>(); //Por defecto: 10
        ArrayList<String> dictado2 = new ArrayList<String>(100);
        Calendar start = Calendar.getInstance();
        for (String list1 : list) {
            dictado1.add(list1);
        }
        Calendar end = Calendar.getInstance();
        System.out.println("Cap. 10: " + (end.getTimeInMillis()-start.getTimeInMillis()));
        start = Calendar.getInstance();
        for (String list1 : list) {
            dictado2.add(list1);
        }
        end = Calendar.getInstance();
        System.out.println("Cap. 100: " + (end.getTimeInMillis()-start.getTimeInMillis()));
    }
}
