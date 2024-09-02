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
    //input
    public int inputSizeOfArray(String mss) {
        return Validation.getInt(mss, "Must enter an integer", "", Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
