/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.ValidationAndNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class Inputer {

    public Inputer() {
    }

    private int[][] inputValueOfMatrix(int order, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String message = "Enter Matrix" + order + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:";
                matrix[i][j] = ValidationAndNormalizationTextUtil.checkInputInRange(message, "Values of matrix must be the number", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    public int inputRowOfMatrix(int order) {
        int sizeOfRow = ValidationAndNormalizationTextUtil.checkInputInRange("Enter Row Matrix " + order + ":", "Values of matrix must be the number", 1, 50);
        return sizeOfRow;
    }

    public int inputColOfMatrix(int order) {
        int sizeOfColumn = ValidationAndNormalizationTextUtil.checkInputInRange("Enter Column Matrix " + order + ":", "Values of matrix must be the number", 1, 50);
        return sizeOfColumn;
    }

    public int[][] inputMatrix1(int row, int col) {
        return inputValueOfMatrix(1, row, col);
    }

    public int[][] inputMatrix2(int row, int col) {
        return inputValueOfMatrix(2, row, col);
    }

}
