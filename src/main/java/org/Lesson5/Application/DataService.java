package org.Lesson5.Application;

import java.util.List;

public interface DataService {


    void create(Student student, List<Student> lst);

    void read(List<Student> lst);
}
