package org.homeworkDataProgram.Interfaces;

import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public interface CeoDataService extends SupervisorDataService {
    void create(Employee employee, Map<Integer, Employee> employeeList);
    void assessFine(Employee employee, Double fine);
}