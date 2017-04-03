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
public class Calculadora extends Computador {

    @Override
    public String agregar(String in) {
        return in + " \"123456789\"";
    }

    public static String agregar2(String in) {
        return in + " \"1024\"";
    }
}
