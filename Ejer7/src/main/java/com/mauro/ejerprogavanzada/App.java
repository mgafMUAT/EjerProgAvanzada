package com.mauro.ejerprogavanzada;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //Sin tipificación
        LinkList lList = new LinkList();
        lList.insertFirst(12345);
        lList.insertFirst("RevolvE");
        lList.insertFirst(new java.util.GregorianCalendar());
        lList.displayList();
        
        //La clase ahora lleva dos atributos
        LinkList2<Integer,String> dList = new LinkList2();
        dList.insertFirst(256, "Byte");
        dList.insertFirst(943, "Hello, world.");
    }
}
