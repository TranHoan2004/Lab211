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
public class Input {

    public int getIntegerNumber(String mss) {
        return Validation.getInt(mss, "Must enter an integer", "Out of range", Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public double getDoubleNumber(String mss) {
        return Validation.getDouble(mss, "Must enter an integer", Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
