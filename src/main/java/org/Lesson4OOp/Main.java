package org.Lesson4OOp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Double[] array = new Double[2];
//        array[0] = 0.2;
//        array[1] = 1.0;
//        Double[] array2 = new Double[2];
//        array2[0] = 10.1;
//        array2[1] = 1.0;
//
//        BoxWithNumber<Double> box1 = new BoxWithNumber<>(array);
//        BoxWithNumber<Double> box2 = new BoxWithNumber<>(array2);
//       // System.out.println(box1.compare(box2));
//        //System.out.println(box1.average());
//        Calc2 calc = new Calc2();
//        List<Double> ls = new ArrayList<>();
//        List<Integer> ls2 = new ArrayList<>();
//        for (int i = 0; i < 10; i++){
//            ls.add((double)  i);
//            ls2.add(i);
//        }
//        System.out.println(calc.sum(ls));
//        System.out.println(calc.sum(ls2));
        List<Employer> employers = new ArrayList<>();
        LRUCashe<Employer> cash = new LRUCashe<>(5);
        for (int i = 0; i < 10; i++){
            Employer em = new Employer();

        }
    }

}