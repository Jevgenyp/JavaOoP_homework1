package org.calculator.View;

import org.calculator.Operations.Model;
import org.calculator.Presentation.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}