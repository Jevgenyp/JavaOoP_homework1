package org.homeworkDataProgram.Service;

import org.homeworkDataProgram.Interfaces.CeoDataService;
import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public class CeoService implements CeoDataService {
    @Override
    public void read(Integer id, Map<Integer, Employee> employeeList) {
        if(employeeList.containsKey(id)) {
            System.out.println(employeeList.get(id).toString());
        }
    }

    @Override
    public void create(Employee employee, Map<Integer, Employee> employeeList) {
        employeeList.put(employee.getId(), employee);
    }

    @Override
    public void assessFine(Employee employee, Double fine) {
        employee.setFine(fine);
    }


    @Override
    public void calcSalary(Employee employee, Map<Integer, Double> salaryList) {
        salaryList.put(employee.getId(), employee.calculateSalary());

    }
}
