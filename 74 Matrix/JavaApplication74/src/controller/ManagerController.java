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
public class ManagerController {

    private Manager manager;

    public ManagerController() {
        manager = new Manager();
    }

    public void addMatrix() {
        Input input = new Input();
        //nhap cho matrix 1
        int sizeOfRow1 = input.inputRowOfMatrix(1);
        int sizeOfCol1 = input.inputColOfMatrix(1);
        input.inputValueOfMatrix(1, sizeOfRow1, sizeOfCol1);
        int[][] matrix1 = input.getMatrix();
        //nhap cho matrix 2
        int sizeOfRow2 = input.inputRowOfMatrix(2);
        int sizeOfCol2 = input.inputColOfMatrix(2);
        input.inputValueOfMatrix(2, sizeOfRow2, sizeOfCol2);
        int[][] matrix2 = input.getMatrix();
        manager = new Manager(matrix1, matrix2, sizeOfRow1, sizeOfCol1, sizeOfRow2, sizeOfCol2);
    }

    public void additionMatrix() throws Exception {
        addMatrix();
        if (!manager.additionMatrix()) {
            throw new Exception("Two matrix must have the same size");
        }
    }

    public void subtractionMatrix() throws Exception {
        addMatrix();
        if (!manager.subtractionMatrix()) {
            throw new Exception("Two matrix must have the same size");
        }
    }

    public void multiplicationMatrix() throws Exception {
        addMatrix();
        if (!manager.multipliTwoMatrice()) {
            throw new Exception("Calculate failed");
        }
    }

    public int[][] getMatrix() {
        return manager.getMatrix();
    }

   public int getSizeOfRow1() {
        return manager.getSizeOfRow1();
    }

    public int getSizeOfCol1() {
        return manager.getSizeOfCol1();
    }

    public int getSizeOfRow2() {
        return manager.getSizeOfRow2();
    }

    public int getSizeOfCol2() {
        return manager.getSizeOfCol2();
    }

    public int[][] getMatrix1() {
        return manager.getMatrix1();
    }

    public int[][] getMatrix2() {
        return manager.getMatrix2();
    }
}
