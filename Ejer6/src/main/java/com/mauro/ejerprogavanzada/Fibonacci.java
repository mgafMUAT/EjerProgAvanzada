/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mauro.ejerprogavanzada;

import java.util.ArrayList;

/**
 *
 * @author MauricioGabriel
 */
public class Fibonacci {

    private int avance;
    private ArrayList<Integer> secuencia;
    private static Fibonacci instancia;

    public static Fibonacci getInstance() {
        if (instancia == null) {
            instancia = new Fibonacci();
        }
        return instancia;
    }

    private Fibonacci() {
        this.avance = 1;
        this.secuencia = new ArrayList<Integer>();
        this.secuencia.add(0,0);
        this.secuencia.add(1,1);
    }

    public int getNumber(int n) {
        if (this.avance < n) {
            for (int i = this.avance; i < n; i++) {
                this.secuencia.add(i + 1, secuencia.get(i) + secuencia.get(i - 1));
            }
        }
        return this.secuencia.get(n);
    }

}
