/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Inputer;
import bo.Manager;

/**
 *
 * @author ADMIN
 */
public class ManagerController {
    private Inputer input;
    private Manager manager;

    public ManagerController() {
        input = new Inputer();
        manager = new Manager();
    }
    public int inputSizeOfArray() {
        int size = input.inputSizeOfArray();
        return size;
    }
    public int[] inputArray(int size) {        
        return input.inputArray(size);
    }
    public void sort(int[] arr) {
        manager.bubbleSort(arr);
    }
    public void printArray(int[] arr) {
        manager.print(arr);
    }
}
