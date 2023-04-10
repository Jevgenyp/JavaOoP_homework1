package org.Lesson5.Application;


public abstract class User {
    protected String name;
    protected Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public abstract void info();

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
