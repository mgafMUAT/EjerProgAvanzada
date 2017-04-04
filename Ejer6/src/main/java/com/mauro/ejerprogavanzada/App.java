package com.mauro.ejerprogavanzada;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //Se hace uso de la estructura de Listas Enlazadas, materia vista en el
        //ramo Estructuras de datos, modificado para acceptar una clase genérica
        //Se crean dos listas: Una para números y otra para palabras en inglés
        LinkList2<String> english = new LinkList2<String>();
        String input = "point\ntremendous\nconfused\nyummy\nelegant\nplantation"
                + "\nlive\nincompetent\nhospitable\npumped\ncolor\nabrupt\n" +
                "hilarious\ninsect\ndivergent";
        for (String word : input.split("\n")) {
            english.insertFirst(word);
        }
        english.displayList();
        //Lista de números
        LinkList2<Integer> numeros = new LinkList2<Integer>();
        //Por algo de creatividad, agrego números de la secuencia Fibonacci
        Fibonacci fib = Fibonacci.getInstance();
        //Para números al azar
        java.util.Random rand = new java.util.Random();
        //10 de Fibonacci, 10 aleatorios del 0 al 1000
        for (int i = 0; i < 10; i++) {
            numeros.insertFirst(fib.getNumber(rand.nextInt(39)));
            numeros.insertFirst(rand.nextInt(1001));
        }
        numeros.displayList();
    }
}
