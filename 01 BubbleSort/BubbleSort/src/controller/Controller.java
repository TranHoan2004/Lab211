/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.ArrayInput;
import bo.ArrayManager;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final ArrayInput input;
    private final ArrayManager manager;

    public Controller() {
        input = new ArrayInput();
        manager = new ArrayManager();
    }

    public int getSize() {
        return input.inputSizeOfArray();
    }

    public int[] getArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Validation.getInteger("a[" + i + "]=");
        }
        return arr;
    }

    public void sort(int[] arr) {
        manager.bubbleSort(arr);
    }

    public void printArray(int[] arr) {
        manager.print(arr);
    }
}
