package org.Lesson5.Application;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
   private static List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }


    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
