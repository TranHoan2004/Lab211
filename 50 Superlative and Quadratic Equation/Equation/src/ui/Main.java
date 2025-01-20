/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.Controller;
import utils.Validation;

import java.util.ArrayList;

/**
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Controller c = new Controller();
        String menu = """
                ========= Equation Program =========
                1. Calculate Superlative Equation
                2. Calculate Quadratic Equation
                3. Exit
                """;
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt("Please choice one option: ", "Must enter an integer", "Out of range!", 1, 3);
            switch (choice) {
                case 1:
                    System.out.println("----- Calculate Equation -----");
                    try {
                        System.out.println("Solution: " + c.calculateEquation());
                        print(c.getListOfOddNumber(), c.getListOfEvenNumber());
                        printPerfectSquare(c.getListOfPerfectSquare());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("----- Calculate Quadratic Equation -----");
                    try {
                        System.out.println("Solution: " + c.calculateQuadraticEquation());
                        print(c.getListOfOddNumber(), c.getListOfEvenNumber());
                        printPerfectSquare(c.getListOfPerfectSquare());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void printPerfectSquare(ArrayList<Double> a) {
        System.out.println();
        if (!a.isEmpty()) {
            System.out.print("Number is Perfect Square: ");
            for (Double x : a) {
                if (a.indexOf(x) == a.size() - 1) {
                    System.out.printf("%.3f", x);
                } else {
                    System.out.printf("%.3f", x);
                    System.out.print(", ");
                }
            }
        }
    }

    private static void print(ArrayList<Double> a, ArrayList<Double> b) {
        if (!a.isEmpty()) {
            System.out.print("Number is Odd: ");
            for (Double x : a) {
                if (a.indexOf(x) == a.size() - 1) {
                    System.out.printf("%.3f", x);
                } else {
                    System.out.printf("%.3f", x);
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        if (!b.isEmpty()) {
            System.out.print("Number is Even: ");
            for (Double x : b) {
                if (b.indexOf(x) == b.size() - 1) {
                    System.out.printf("%.3f", x);
                } else {
                    System.out.printf("%.3f", x);
                    System.out.print(", ");
                }
            }
        }
    }
}
