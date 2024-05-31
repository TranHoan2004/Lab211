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

    private Manager manager = new Manager();

    public void typeA() {
        Input input = new Input();
        double a = input.getA();
        double b = input.getB();
        String operator = Validation.checkOperator("Enter Operator: ", "Please input (+,-,*,/,^)");
        double ans = manager.normalCalculator(a, b, operator);
    }
    public void typeB() {
        double weight = Validation.getDouble("Enter Weight(kg): ", "BMI is digit");
        double height = Validation.getDouble("Enter Height(cm): ", "BMI is digit");
        manager.bmiCalculator(weight, height); 
    }
}
