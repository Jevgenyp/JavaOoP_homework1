//4)Написать Generic-class LRUCache, с методами : addElement, getElement(по позиции), getAllElement . Посмотреть как поведет себя с классом Employee(fio,salary,jobTitle)
//Логика кэша такая:
//в конструктор при создании подается количество кэшируемых элементов
//При переполнении крайний левый элемент кэша(самый старый) удаляется
//В самый правый конец добавляется новый элемент
package org.Lesson4OOp;

import lombok.Data;

import java.util.ArrayList;

@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class LRUCashe<T> {
    private ArrayList<T> list;
    private Integer size;

    public LRUCashe(Integer size) {
        this.size = size;
        this.list = new ArrayList<>();
    }

    public void addElement(T element) {
        if (this.list.size() < size) {
            this.list.add(element);
        } else {
            this.list.remove(0);
            this.list.add(element);
        }
    }

    public T getElement(Integer pos) {
        if (pos < list.size()&& pos > - 1) {
            return list.get(pos);
        }
        else {
            System.out.println("No element!");
            return null;
        }

    }

}
