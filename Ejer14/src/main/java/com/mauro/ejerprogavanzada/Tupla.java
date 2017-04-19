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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.dt1;
        hash = 79 * hash + (this.dt2 != null ? this.dt2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tupla other = (Tupla) obj;
        if (this.dt1 != other.dt1) {
            return false;
        }
        return !((this.dt2 == null) ? (other.dt2 != null) : !this.dt2.equals(other.dt2));
    }

    public int compareTo(Tupla t) {
        return (this.getDt1() != t.getDt1()) ? (this.getDt1() - t.getDt1())
                : this.getDt2().compareTo(t.getDt2()) * -1;
    }

}
