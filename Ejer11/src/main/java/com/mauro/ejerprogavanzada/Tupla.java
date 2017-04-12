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
public class Tupla {

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
}
