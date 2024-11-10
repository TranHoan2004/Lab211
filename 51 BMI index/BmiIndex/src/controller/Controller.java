/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.BmiManager;
import bo.Input;
import bo.OperatorManager;
import bo.OperatorManager.Type;
import util.Validation;

/**
 * @author ADMIN
 */
public class Controller {
    private final OperatorManager operatorManager;
    private final BmiManager bmiManager;
    private final Input input;

    public Controller() {
        this.operatorManager = new OperatorManager();
        this.bmiManager = new BmiManager();
        this.input = new Input();
    }

    public void getA() {
        double a = input.getA();
        operatorManager.setNum(a);
    }

    public Type getOperation() {
        return input.getOperation();
    }

    public double typeA(Type operator) throws Exception {
        Input input = new Input();
        if (operator == Type.EQUAL) {
            return operatorManager.getAnswer();
        }
        double b = input.getB();
        switch (operator) {
            case SUM:
                operatorManager.normalCalculator(b, Type.SUM);
                break;
            case SUB:
                operatorManager.normalCalculator(b, Type.SUB);
                break;
            case MULTI:
                operatorManager.normalCalculator(b, Type.MULTI);
                break;
            case DIV:
                operatorManager.normalCalculator(b, Type.DIV);
                break;
            case POW:
                operatorManager.normalCalculator(b, Type.POW);
                break;
        }
        return operatorManager.getAnswer();
    }

    public double typeB() {
        double weight = Validation.getDouble("Enter Weight(kg): ", "Weight is a number");
        double height = Validation.getDouble("Enter Height(cm): ", "Weight is a number");
        bmiManager.setWeight(weight);
        bmiManager.setHeight(height);
        return bmiManager.bmiCalculator();
    }
}
