package org.Lesson5.Application;

public class Controller {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 19, "B-52");
        UserService usServ = new UserService();
        StudentData data = new StudentData();
        usServ.create(student1, data.getStudentList());
        usServ.read(data.getStudentList());
        StudentView studentView = new StudentView();
        studentView.view(student1);
        TeacherView teacherView = new TeacherView();
        teacherView.view();
        teacherView.view(student1);
    }
}
