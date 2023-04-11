package org.homeworkDataProgram;

import org.homeworkDataProgram.Model.*;
import org.homeworkDataProgram.Service.AcountantService;
import org.homeworkDataProgram.Service.CeoService;
import org.homeworkDataProgram.View.AcountantView;
import org.homeworkDataProgram.View.CeoView;
import org.homeworkDataProgram.View.SupplyChainView;

public class Controller {
    public static void main(String[] args) {

        // Инициализация данных
        Employee supply1 = new SupplyChain("Igor Varuskin", 44, 4, 1, 168);
        Employee supply2 = new SupplyChain("Limbo Alikin", 33, 6, 2, 155);
        Employee supply3 = new SupplyChain("Ivan Egorov", 24, 2, 3, 178);
        Employee accountant = new Acountant("Petr Namazan", 50, 15, 4,
                50000.0, 22, 22);
        Employee ceo = new Ceo("Vasya Pupkin", 62, 9, 5,
                70000.0, 22, 21);


        // проверка функционала

        CeoService ceoService = new CeoService();
        ceoService.create(supply1, DataEmployee.getEmployeeList());
        ceoService.create(supply2, DataEmployee.getEmployeeList());
        ceoService.create(supply3, DataEmployee.getEmployeeList());
        ceoService.create(accountant, DataEmployee.getEmployeeList());
        ceoService.create(ceo, DataEmployee.getEmployeeList());

        ceoService.calcSalary(supply1, DataEmployee.getSalaryList());
        ceoService.calcSalary(accountant, DataEmployee.getSalaryList());

        ceoService.assessFine(supply1, 300.0);

        AcountantService accountantService = new AcountantService();
        accountantService.calcSalary(supply2, DataEmployee.getSalaryList());
        accountantService.calcSalary(supply3, DataEmployee.getSalaryList());
        accountantService.calcSalary(ceo, DataEmployee.getSalaryList());

        SupplyChain supplyChain = new SupplyChain();
        supplyChain.read(1, DataEmployee.getEmployeeList());
        System.out.println();

        CeoView ceoView = new CeoView();
        ceoView.viewAll(DataEmployee.getEmployeeList());
        System.out.println(ceo);

        AcountantView acountantView = new AcountantView();
        acountantView.viewSalary(DataEmployee.getSalaryList());
        System.out.println(accountant);

        SupplyChainView supplyChainView = new SupplyChainView();
        supplyChainView.view(supply1);

    }
}
