package org.homeworkDataProgram.Service;

import org.homeworkDataProgram.Interfaces.SupervisorDataService;
import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public class AcountantService implements SupervisorDataService {
    @Override
    public void read(Integer id, Map<Integer, Employee> employeeList) {
        if (employeeList.containsKey(id)) {
            System.out.println(employeeList.get(id).toString());
        }
    }


    @Override
    public void calcSalary(Employee employee, Map<Integer, Double> salaryList) {
        salaryList.put(employee.getId(), employee.calculateSalary());

    }
}