package com.mauro.ejerprogavanzada;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //Variable String para facilitarme la vida
        String abc = "Abecedario";
        //Instanciar un objeto calculadora
        Calculadora calc = new Calculadora();
        //En métodos de instancia, el de la clase hija
        //sobrescibre al de la clase padre
        System.out.println(calc.agregar(abc));
        //En métodos estáticos, el de la clase padre queda oculto
        System.out.println(Calculadora.agregar2(abc));
        /* Salida:
         * Abecedario "123456789"
         * Abecedario "1024"
         */
    }
}
