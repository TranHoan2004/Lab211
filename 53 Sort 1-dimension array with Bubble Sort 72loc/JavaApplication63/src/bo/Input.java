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

    public int getInt() {
        int size = Validation.checkInput("Enter Length Of Array: ", "[0-9]+", "Please input numberand number is greater than zero", 1, Integer.MAX_VALUE);
        return size;
    }

    public int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Validation.checkInput("Enter number " + (i + 1) + ": ", "-?[0-9]+", "Please input an integer number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return array;
    }
}
