/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import util.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final Manager manager = new Manager();

    public void typeA() throws Exception{
        Input input = new Input();
        double a = input.getA();
        double b = input.getB();
        String operator = Validation.checkOperator("Enter Operator: ", "Please input (+,-,*,/,^)");
        manager.normalCalculator(a, b, operator);
        if (!manager.normalCalculator(a, b, operator)) {
            throw new Exception("b equals to 0, cannot be divide");
        }
    }

    public void typeB() throws Exception {
        while (true) {
            double weight = Validation.getDouble("Enter Weight(kg): ", "BMI is digit");
            double height = Validation.getDouble("Enter Height(cm): ", "BMI is digit");
            if (!manager.bmiCalculator(weight, height)) {
                throw new Exception("Some errors in the program");
            }
            break;
        }
    }

    public double getAnswer() {
        return manager.getAnswer();
    }

    public double getBMI() {
        return manager.getBMI();
    }
}
