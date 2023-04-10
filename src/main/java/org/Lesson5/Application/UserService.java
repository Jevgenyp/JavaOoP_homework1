package org.Lesson5.Application;

import java.util.List;

public class UserService implements DataService{


    @Override
    public void create(Student student, List<Student> lst) {

        lst.add(student);
    }

    @Override
    public void read(List<Student> lst) {
        System.out.println(lst.toString());
    }
}
