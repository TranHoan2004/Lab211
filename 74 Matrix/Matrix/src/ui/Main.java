/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
import entity.Matrix;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ManagerController managerController = new ManagerController();
        String menu = """
                      =======Calculator Program=======
                      1. Addition Matrix
                      2. Subtraction Matrix
                      3. Multiplication Matrix
                      4. Quit
                      """;
        while (true) {
            System.out.print(menu);
            int choice = Validation.getInt("Your choice: ", "Please enter an integer number from 1 to 4", 1, 4);
            switch (choice) {
                case 1 -> {
                    System.out.println("\n\n-------Addition-------");
                    try {
                        managerController.additionMatrix();
                        printAnswer1(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n\n-------Subtraction-------");
                    try {
                        managerController.subtractionMatrix();
                        printAnswer1(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("\n\n-------Multiplication-------");
                    try {
                        managerController.multiplicationMatrix();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    printAnswer1(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix());
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

    public static void printAnswer1(int choice, Matrix matrix1, Matrix matrix2, Matrix matrix) {
        System.out.println("\n-------Result-------");
        printMatrix1(matrix1);
        switch (choice) {
            case 1 ->
                System.out.println("+");
            case 2 ->
                System.out.println("-");
            case 3 ->
                System.out.println("/");
        }
        printMatrix1(matrix2);
        System.out.println("=");
        printMatrix1(matrix);
    }

    public static void printMatrix1(Matrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                System.out.print("[" + matrix.getValue()[i][j] + "]");
            }
            System.out.println();
        }
    }
}
