/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.ValidationAnNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class Inputer {

    public int[] inputArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "]=");
            arr[i] = ValidationAnNormalizationTextUtil.checkInputValue();
        }
        return arr;
    }

    public int inputSizeOfArray() {
        int size = 0;
        System.out.print("kich co = ");
        size = ValidationAnNormalizationTextUtil.checkInputValue();
        return size;
    }
}
