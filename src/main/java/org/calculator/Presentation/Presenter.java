package org.calculator.Presentation;

import org.calculator.Logging.Log;
import org.calculator.Logging.Logtxt;
import org.calculator.Operations.*;
import org.calculator.View.UI;
import org.calculator.Operations.Model;

public class Presenter<T extends Model> {
    UI v;
    T model;

    /**
     * Конструктор объекта типа Presenter
     * @param v - объект типа UI
     * @param model - объект типа Model
     */
    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }

    /**
     *  Метод, объединяющий получений значений, выбор операции,  результат и логирование
     */
    public void runOperation() {
        Log log = new Logtxt();
        String txt = "";
        Double x = v.inputDouble.apply("Введите первое число: ");
        Double y = v.inputDouble.apply("Введите второе число: ");
        int choice = v.getChoice();
        switch (choice) {
            case 1: {
                Summarize model = new Summarize();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Subtract model = new Subtract();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 4: {
                Divide model = new Divide();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeFile(txt, "C:\\Users\\Jev\\IdeaProjects\\JavaOoP_homework1\\src\\main\\java\\org\\calculator\\Logging\\Saving.txt");
    }

}
