package org.homeworkDataProgram.Interfaces;

import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public interface DataService {


    void read(Integer id, Map<Integer, Employee> employeeList);

    public interface DirectorDataService extends SupervisorDataService {
        void create(Employee employee, Map<Integer, Employee> employeeList);

        void assessFine(Employee employee, Double fine);
    }
}

