package org.example;

import java.util.ArrayList;

public class Calc<T extends Number> {
    private ArrayList<T> items;


    public Calc(ArrayList<T> items) {
        this.items = items;
    }

    public int sum() {
        int res = 0;
        for (T t : items) {
            res += t.intValue();
        }
        return res;
    }

    public int multiplyAll() {
        int res = 1;
        for (T t : items) {
            res *= t.intValue();
        }
        return res;
    }

    public double multiply(T a, T b) {
        double res = a.doubleValue() * b.doubleValue();
        return res;
    }

    public double divideAll() {
        double res = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            res /= items.get(i).intValue();
        }
        return res;
    }

    public double divide(T a, T b) {
        double res = a.doubleValue() / b.doubleValue();
        return res;
    }

    private int convertToInt(Object a){
        if (a instanceof String){
            return Integer.parseInt((String) a);
        }
        if (a instanceof Double){
            return ((Double) a).intValue(); //извлекаем целочисленное значение через метод округления в Double
        }
        if (a instanceof Float){
            return Math.round((Float) a); //округляем через Math.round
        }
        else return (int)a;
    }

    public String toBinaryCode(Object a) {
        int newInt = convertToInt(a);
        return Integer.toBinaryString(newInt);

    }


}
