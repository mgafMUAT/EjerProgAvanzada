package com.mauro.ejerprogavanzada;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Fibonacci f1 = Fibonacci.getInstance();
        System.out.println(f1.getNumber(8));
        Fibonacci f2 = Fibonacci.getInstance();
        System.out.println(f2.getNumber(13));
        Fibonacci f3 = Fibonacci.getInstance();
        System.out.println(f1.getNumber(5));
    }
}
