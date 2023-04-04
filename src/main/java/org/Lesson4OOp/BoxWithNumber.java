//2)Создать коробку с числами(BoxWithNumber) и найти среднее значение(average) и сравнение средних(compareAverage)
package org.Lesson4OOp;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoxWithNumber<T extends Number> {
    private T[] array;

    public double average(T[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].doubleValue();
        }
        result /= array.length;
        return result;
    }

    //public boolean compare(BoxWithNumber<?> box2) {
        //return 0.0001 > Math.abs(average() - box2.average());
    //}

}
