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

    private final Input input;
    private final Manager manager;

    public Controller() {
        this.input = new Input();
        this.manager = new Manager();
    }

    public int[] getArray() {
        int size = input.getInteger("size="); 
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.getInteger("a[" + i + "]=");
        }
        return arr;
    }
    
    public int[] sort(int[] arr, int first, int last) {
        return manager.quickSort(arr, first, last);
    }
}
