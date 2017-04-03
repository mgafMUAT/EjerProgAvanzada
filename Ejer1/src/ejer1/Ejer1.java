/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author MauricioGabriel
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (String arg : args) {
            for (int i = 0; i < arg.length(); i++) {
                System.out.print(arg.charAt(i) + ((i + 1) == arg.length()
                        ?  "\n" : " - "));
            }
        }
    }

}
