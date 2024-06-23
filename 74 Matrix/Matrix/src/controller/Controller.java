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

    public Matrix additionMatrix() throws Exception {
        return manager.additionMatrix();
    }

    public Matrix subtractionMatrix() throws Exception {
        return manager.subtractionMatrix();
    }

    public Matrix multiplicationMatrix() throws Exception {
        return manager.multiplicationMatrix();
    }

    public Matrix getMatrix1() {
        return manager.getMatrix1();
    }

    public Matrix getMatrix2() {
        return manager.getMatrix2();
    }

}
