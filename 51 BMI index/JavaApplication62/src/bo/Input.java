/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import util.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    public double getA() {
        double a = Validation.getDouble("Enter number a: ", "Please enter a number");
        return a;
    }
    public double getB() {
        double b = Validation.getDouble("Enter number b: ", "Please enter a number");
        return b;
    }
}
