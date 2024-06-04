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
public class Menu {

    private int choice = 0;

    public void menu() {
        String menu = """
                      =======Calculator Program=======
                      1. Addition Matrix
                      2. Subtraction Matrix
                      3. Multiplication Matrix
                      4. Quit
                      """;
        System.out.print(menu);
        choice = Validation.checkInputInRange("Your choice: ", "Please enter an integer number from 1 to 4", 1, 4);
    }

    public int getChoice() {
        return choice;
    }

    public void printMatrix(int[][] matrix1, int sizeOfRow, int sizeOfCol) {
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfCol; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void printAnswer(char sign, int[][] matrix1, int[][] matrix2, int[][] matrix, int sizeOfRow1, int sizeOfCol1, int sizeOfRow2, int sizeOfCol2 ) {
        System.out.println("\n-------Result-------");
        printMatrix(matrix1, sizeOfRow1, sizeOfCol1);
        System.out.println(sign);
        printMatrix(matrix2, sizeOfRow2, sizeOfCol2);
        System.out.println("=");
        printMatrix(matrix, sizeOfRow1, sizeOfCol1);
    }
}
