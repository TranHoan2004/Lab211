/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private int[][] matrix;

    public Input() {
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void inputValueOfMatrix(int order, int row, int col) {
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String message = "Enter Matrix" + order + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:";
                matrix[i][j] = Validation.checkInputInRange(message, "Values of matrix must be the number", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
    }

    public int inputRowOfMatrix(int order) {
        int sizeOfRow = Validation.checkInputInRange("Enter Row Matrix " + order + ":", "Values of matrix must be the number", 1, 50);
        return sizeOfRow;
    }

    public int inputColOfMatrix(int order) {
        int sizeOfColumn = Validation.checkInputInRange("Enter Column Matrix " + order + ":", "Values of matrix must be the number", 1, 50);
        return sizeOfColumn;
    }
}
