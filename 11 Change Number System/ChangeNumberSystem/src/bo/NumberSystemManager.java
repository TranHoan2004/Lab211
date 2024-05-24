/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class NumberSystemManager {
    private Object[] array;
    private int top, max;
    public Double inputNumber() {
        double number = Validation.getDouble("Enter number: ", "Only numbers", Double.MIN_VALUE, Double.MAX_VALUE);
        return number;
    }
    public void changeToBinary() {
        double number = inputNumber();
        
    }
    public void changeToDecimal() {
        double number = inputNumber();
        
    }
    public void changeToHexa() {
        double number = inputNumber();
        
    }
    
}
