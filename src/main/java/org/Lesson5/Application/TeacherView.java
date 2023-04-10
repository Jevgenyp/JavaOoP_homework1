package org.Lesson5.Application;

public class TeacherView {
    public void view(Student student) {
        StudentData std = new StudentData();
        for (Student s: std.getStudentList()) {
            if (s.equals(student)){
                System.out.println(s.toString());
            }
        }
    }
    public void view(){
        StudentData std = new StudentData();
        System.out.println(std.getStudentList().toString());

    }

}
