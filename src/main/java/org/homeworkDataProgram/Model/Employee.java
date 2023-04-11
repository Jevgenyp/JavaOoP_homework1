package org.homeworkDataProgram.Model;

public abstract class Employee {
    protected String name;
    protected Integer age;
    protected Integer serviceLength; //стаж
    protected Double salary;
    protected Integer id;
    protected Double fine;
    public Employee() {
    }

    public Employee(String name, Integer age, Integer serviceLength, Integer id) {
        this.name = name;
        this.age = age;
        this.serviceLength = serviceLength;
        this.id = id;
        this.fine = 0.0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", serviceLength=" + serviceLength +
                ", salary=" + salary +
                ", fine=" + fine +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getServiceLength() {
        return serviceLength;
    }

    public void setServiceLength(Integer serviceLength) {
        this.serviceLength = serviceLength;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }


    public abstract Double calculateSalary();
}
