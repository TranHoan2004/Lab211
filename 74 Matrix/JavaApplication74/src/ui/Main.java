/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.ManagerController;
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
        System.out.print(menu);
        int choice = Validation.getInt("Your choice: ", "Please enter an integer number from 1 to 4", 1, 4);
        while (true) {
            System.out.print(menu);
            switch (choice) {
                case 1 -> {
                    System.out.println("\n\n-------Addition-------");
                    try {
                        managerController.additionMatrix();
                        printAnswer(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                                managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n\n-------Subtraction-------");
                    try {
                        managerController.subtractionMatrix();
                        printAnswer(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                                managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
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
                    printAnswer(choice, managerController.getMatrix1(), managerController.getMatrix2(), managerController.getMatrix(),
                            managerController.getSizeOfRow1(), managerController.getSizeOfCol1(), managerController.getSizeOfRow2(), managerController.getSizeOfCol2());
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix1, int sizeOfRow, int sizeOfCol) {
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfCol; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void printAnswer(int choice, int[][] matrix1, int[][] matrix2, int[][] matrix, int sizeOfRow1, int sizeOfCol1, int sizeOfRow2, int sizeOfCol2) {
        System.out.println("\n-------Result-------");
        printMatrix(matrix1, sizeOfRow1, sizeOfCol1);
        switch (choice) {
            case 1 ->
                System.out.println("+");
            case 2 ->
                System.out.println("-");
            case 3 ->
                System.out.println("/");
        }
        printMatrix(matrix2, sizeOfRow2, sizeOfCol2);
        System.out.println("=");
        printMatrix(matrix, sizeOfRow1, sizeOfCol1);
    }
}
