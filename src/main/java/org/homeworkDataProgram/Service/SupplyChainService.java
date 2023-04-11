package org.homeworkDataProgram.Service;

import org.homeworkDataProgram.Interfaces.DataService;
import org.homeworkDataProgram.Model.Employee;

import java.util.Map;

public class SupplyChainService implements DataService {

    @Override
    public void read(Integer id, Map<Integer, Employee> employeeList) {
        if (employeeList.containsKey(id)) {
            System.out.println(employeeList.get(id).toString());
        }
    }
}