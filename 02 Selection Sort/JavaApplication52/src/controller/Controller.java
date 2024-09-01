/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;

/**
 *
 * @author ADMIN
 */
public class Controller {

    public final Input input;
    public final Manager manager;

    public Controller() {
        this.input = new Input();
        this.manager = new Manager();
    }

    public int getSize() {
        return input.inputSizeOfArray("size=");
    }

    public int[] getArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.inputSizeOfArray("a[" + i + "]=");
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return manager.selectionSort(arr);
    }
}
