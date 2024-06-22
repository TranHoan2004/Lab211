/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Matrix;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private Manager manager;

    public Controller() {
        this.manager = new Manager();
    }

    public void additionMatrix() throws Exception {
        addMatrix();
        manager.additionMatrix();
    }

    public void subtractionMatrix() throws Exception {
        addMatrix();
        manager.subtractionMatrix();
    }

    public void multiplicationMatrix() throws Exception {
        addMatrix();
        manager.multipliTwoMatrice();
    }

    private void addMatrix() {
        Input input = new Input();

        //nhap cho matrix 1
        Matrix matrix1 = input.getMatrix(1);

        //nhap cho matrix 2
        Matrix matrix2 = input.getMatrix(2);

        manager.setMatrix_1(matrix1); 
        manager.setMatrix_2(matrix2); 
    }

    public Matrix getMatrix1() {
        return manager.getMatrix_1();
    }

    public Matrix getMatrix2() {
        return manager.getMatrix_2();
    }

    public Matrix getMatrix() {
        return manager.getMatrix();
    }
}
