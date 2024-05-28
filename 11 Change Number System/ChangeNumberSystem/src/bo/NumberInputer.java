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
public class NumberInputer {
    public Double getDouble() {
        double number = Validation.getDouble("Enter number: ", "Only numbers", Double.MIN_VALUE, Double.MAX_VALUE);
        return number;
    }
    
}
