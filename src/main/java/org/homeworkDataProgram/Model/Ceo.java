package org.homeworkDataProgram.Model;

public class Ceo extends Employee{
    private Double monthRate;
    private Integer monthWorkingDay;
    private Integer WorkingDayFact;

    public Ceo() {
    }

    public Ceo(String name, Integer age, Integer serviceLength, Integer id, Double monthRate, Integer monthWorkingDay, Integer workingDayFact) {
        super(name, age, serviceLength, id);
        this.monthRate = monthRate;
        this.monthWorkingDay = monthWorkingDay;
        WorkingDayFact = workingDayFact;
    }

    public Double getMonthRate() {
        return monthRate;
    }

    public void setMonthRate(Double monthRate) {
        this.monthRate = monthRate;
    }

    public Integer getMonthWorkingDay() {
        return monthWorkingDay;
    }

    public void setMonthWorkingDay(Integer monthWorkingDay) {
        this.monthWorkingDay = monthWorkingDay;
    }

    public Integer getWorkingDayFact() {
        return WorkingDayFact;
    }

    public void setWorkingDayFact(Integer workingDayFact) {
        WorkingDayFact = workingDayFact;
    }

    @Override
    public String toString() {
        return "Ceo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", serviceLength=" + serviceLength +
                ", monthRate=" + monthRate +
                ", monthWorkingDay=" + monthWorkingDay +
                ", WorkingDayFact=" + WorkingDayFact +
                ", salary=" + salary +
                ", fine=" + fine +
                '}';
    }

    @Override
    public Double calculateSalary() {
        salary = (this.monthRate/this.monthWorkingDay)*this.WorkingDayFact;
        return salary;
    }
}
