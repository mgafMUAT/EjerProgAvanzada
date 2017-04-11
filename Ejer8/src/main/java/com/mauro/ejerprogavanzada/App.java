package com.mauro.ejerprogavanzada;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(Integer.MAX_VALUE);
        ints.add(Integer.SIZE);
        ints.add(Integer.MIN_VALUE);
        System.out.println(sumaUpperBounded(ints));
        
        ArrayList<Number> nums = new ArrayList<Number>();
        nums.add(9000);
        nums.add(Integer.BYTES);
        nums.add(60/3);
        System.out.println(sumaLowerBounded(nums));
    }

    public static double sumaUpperBounded(ArrayList<? extends Number> lista) {
        double sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i).doubleValue();
        }
        return sum;
    }
    public static double sumaLowerBounded(ArrayList<? super Integer> lista) {
        int sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum += (Integer) lista.get(i);
        }
        return sum;
    }
}
