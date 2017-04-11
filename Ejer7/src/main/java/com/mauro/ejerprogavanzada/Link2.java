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
class Link2<E,K> {

    public E iData;
    public K sData;
    public Link2 next;
    public Link2 previous;

    public Link2(E id,K sec) {
        iData = id;
        sData = sec;
    }

    public void displayLink() {
        System.out.print("{" + iData + " " + sData + "} ");
    }
}
