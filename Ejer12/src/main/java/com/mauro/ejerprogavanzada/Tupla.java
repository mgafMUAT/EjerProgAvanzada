/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mauro.ejerprogavanzada;

/**
 *
 * @author MauricioGabriel
 */
public class Tupla implements Comparable<Tupla> {

    private final int dt1;

    private final String dt2;

    public Tupla(int dt1, String dt2) {
        this.dt1 = dt1;
        this.dt2 = dt2;
    }

    public int getDt1() {
        return dt1;
    }

    public String getDt2() {
        return dt2;
    }

    @Override
    public String toString() {
        return dt1 + " - " + dt2;
    }

    public int compareTo(Tupla t) {
        return (this.getDt2().charAt(0) != t.getDt2().charAt(0))
                ? (this.getDt2().charAt(0) - t.getDt2().charAt(0))
                : this.getDt1() - t.getDt1();
    }
}
