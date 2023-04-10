package org.Lesson5.Application;

public class StudentView {

    public void view(Student student) {
        StudentData std = new StudentData();
        for (Student s: std.getStudentList()) {
            if (s.equals(student)){
                System.out.println(s.toString());
            }

        }


    }
}
