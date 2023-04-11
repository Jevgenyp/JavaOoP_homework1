package org.homeworkDataProgram.Model;

import java.util.Map;

public class SupplyChain extends Employee {
    private Integer workHours;
    private Double hourlyRate;

    public SupplyChain() {
    }

    public SupplyChain(String name, Integer age, Integer serviceLength, Integer id, Integer workHours) {
        super(name, age, serviceLength, id);
        this.workHours = workHours;
        if(serviceLength<5){
            this.hourlyRate = 185.0;
        }
        else {
            this.hourlyRate = 237.0;
        }

    }

    public static void read(int i, Map<Integer, Employee> employeeList) {

    }

    @Override
    public String toString() {
        return "Supply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", serviceLength=" + serviceLength +
                "workHours=" + workHours +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", fine=" + fine +
                '}';
    }



    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public Double calculateSalary() {
        salary = this.workHours*this.hourlyRate - fine;
        return salary;
    }

}
