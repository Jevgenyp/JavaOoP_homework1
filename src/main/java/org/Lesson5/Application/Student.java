package org.Lesson5.Application;

public class Student extends User {
    String group;

    public Student(String group) {


    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }

    public Student(String name, Integer age, String group) {
        super(name, age);
        this.group = group;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void info() {
        System.out.println("Студент " + super.name + "Возраст: " + super.age +  "Группа" + this.group);
    }
}
