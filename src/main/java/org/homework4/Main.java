package org.homework4;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        List<Double> ls1 = new ArrayList<>(Arrays.asList(1.0, 3.0, 4.5));
        List<Integer> ls2 = new ArrayList<>(Arrays.asList(1, 4, 8, 6));
        List<Object> ls3 = new ArrayList<>(Arrays.asList(11.3,9.0,87.721));
        List<Object> ls4 = new ArrayList<>(Arrays.asList("116","56"));
        System.out.println(calc.sum(ls1));
        System.out.println(calc.sum(ls2));
        System.out.println(calc.multiply(ls1));
        System.out.println(calc.multiply(ls2));
        System.out.println(calc.division(ls1));
        System.out.println(calc.division(ls2));
        System.out.println(calc.toBinary(ls3));
        System.out.println(calc.toBinary(ls4));

    }
}