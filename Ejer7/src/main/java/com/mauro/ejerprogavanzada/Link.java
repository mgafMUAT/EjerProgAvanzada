package com.mauro.ejerprogavanzada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MauricioGabriel
 */
class Link<E> {

    public E iData;
    public Link next;
    public Link previous;

    public Link(E id) {
        iData = id;
    }

    public void displayLink() {
        System.out.print("{" + iData + "} ");
    }
}
