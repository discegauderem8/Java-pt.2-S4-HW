package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Calc calc = new Calc(myList);
        System.out.println(calc.divideAll());
        System.out.println(calc.multiply(1,2));
//        float a = 6.0f;
        System.out.println(calc.toBinaryCode("6"));
    }
}