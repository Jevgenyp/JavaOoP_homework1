package org.Lesson7.Calculator.Calculator;

public class LogFactory implements ICalculableFactory {
    private Loggable loggable;
    public LogFactory (ICalculableFactory calculableFactory){
        Loggable loggable1 = this.loggable;
        new LoggerCalc();
    }
    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
