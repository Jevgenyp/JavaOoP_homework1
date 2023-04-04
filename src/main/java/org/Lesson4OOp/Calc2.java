package org.Lesson4OOp;

import java.util.List;


public class Calc2 {
    public Double sum(List<? extends Number> list){
        Double sum =0.0;
        for (Number num:
                list) {
            sum+=num.doubleValue();

        }
        return sum;
    }
}
