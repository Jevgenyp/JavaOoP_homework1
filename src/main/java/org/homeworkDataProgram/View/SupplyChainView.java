package org.homeworkDataProgram.View;

import org.homeworkDataProgram.Model.DataEmployee;
import org.homeworkDataProgram.Model.Employee;

public class SupplyChainView {
    public void view(Employee supply) {

        if(DataEmployee.getEmployeeList().containsKey(supply.getId())) {
            System.out.println(DataEmployee.getEmployeeList().get(supply.getId()).toString());
        }
    }
}