package org.homeworkDataProgram.Interfaces;

import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public interface SupervisorDataService extends DataService {

    abstract void read(Integer id, Map<Integer, Employee> employeeList);

    void calcSalary(Employee employee, Map<Integer, Double> salaryList);
    }



