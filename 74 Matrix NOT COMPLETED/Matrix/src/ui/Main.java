/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import controller.Controller;
import entity.Matrix;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        String menu = "=======Calculator Program=======\n"
                + "1. Addition Matrix\n"
                + "2. Subtraction Matrix\n"
                + "3. Multiplication Matrix\n"
                + "4. Quit\n";
        while (true) {
            System.out.print(menu);
            int choice = Validation.getInt("Your choice: ", "Please enter an integer number from 1 to 4", 1, 4);
            switch (choice) {
                case 1:
                    System.out.println("\n\n-------Addition-------");
                    try {
                        Matrix matrix = controller.additionMatrix();
                        printAnswer1(choice, controller.getMatrix1(), controller.getMatrix2(), matrix);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\n\n-------Subtraction-------");
                    try {
                        Matrix matrix = controller.subtractionMatrix();
                        printAnswer1(choice, controller.getMatrix1(), controller.getMatrix2(), matrix);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\n\n-------Multiplication-------");
                    try {
                        Matrix matrix = controller.multiplicationMatrix();
                        printAnswer1(choice, controller.getMatrix1(), controller.getMatrix2(), matrix);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void printAnswer1(int choice, Matrix matrix1, Matrix matrix2, Matrix matrix) {
        System.out.println("\n-------Result-------");
        printMatrix1(matrix1);
        switch (choice) {
            case 1:
                System.out.println("+");
                break;
            case 2:
                System.out.println("-");
                break;
            case 3:
                System.out.println("/");
                break;
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
