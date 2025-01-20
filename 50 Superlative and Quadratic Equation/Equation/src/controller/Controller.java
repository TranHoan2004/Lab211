/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import java.util.ArrayList;

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

    public String calculateEquation() throws Exception {
        double a = input.getDoubleNumber("Enter A: ");
        if (a == 0) throw new Exception("The number is divided can not equal to 0");
        double b = input.getDoubleNumber("Enter B: ");
        return manager.solveEquation(a, b);
    }

    public String calculateQuadraticEquation() throws Exception {
        double a = input.getDoubleNumber("Enter A: ");
        double b = input.getDoubleNumber("Enter B: ");
        double c = input.getDoubleNumber("Enter C: ");
        if (manager.solveQuadraticEquation(a, b, c) == null) throw new Exception("No answer");
        return manager.solveQuadraticEquation(a, b, c);
    }

    public ArrayList<Double> getListOfOddNumber() {
        return new ArrayList<>(manager.getOdd()); // tao ban sao cua du lieu
    }

    public ArrayList<Double> getListOfEvenNumber() {
        return new ArrayList<>(manager.getEven());
    }

    public ArrayList<Double> getListOfPerfectSquare() {
        return new ArrayList<>(manager.getPerfectSquare());
    }
    
    
}
