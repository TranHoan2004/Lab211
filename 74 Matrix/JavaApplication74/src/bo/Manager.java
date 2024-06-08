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
public class Manager {

    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrix;
    private int sizeOfRow1;
    private int sizeOfCol1;
    private int sizeOfRow2;
    private int sizeOfCol2;

    public Manager() {
    }

    public Manager(int[][] matrix1, int[][] matrix2, int sizeOfRow1, int sizeOfCol1, int sizeOfRow2, int sizeOfCol2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.sizeOfRow1 = sizeOfRow1;
        this.sizeOfCol1 = sizeOfCol1;
        this.sizeOfRow2 = sizeOfRow2;
        this.sizeOfCol2 = sizeOfCol2;
    }

    public boolean additionMatrix() {
        if (!checkEqualSizeOfTwoMatrix()) {
            return false;
        }
        matrix = new int[sizeOfRow1][sizeOfCol1];
        for (int i = 0; i < sizeOfRow1; i++) {
            for (int j = 0; j < sizeOfCol1; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return true;
    }

    public boolean subtractionMatrix() {
        if (!checkEqualSizeOfTwoMatrix()) {
            return false;
        }
        matrix = new int[sizeOfRow1][sizeOfCol1];
        for (int i = 0; i < sizeOfRow1; i++) {
            for (int j = 0; j < sizeOfCol1; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return true;
    }

    public boolean multipliTwoMatrice() {
        if (sizeOfCol1 != sizeOfRow2) {
            return false;
        }
        sizeOfRow1 = matrix1.length;
        int cols1 = matrix1[0].length;
        sizeOfCol1 = matrix2[0].length;
        matrix = new int[sizeOfRow1][sizeOfCol1];
        for (int i = 0; i < sizeOfRow1; i++) {
            for (int j = 0; j < sizeOfCol1; j++) {
                for (int k = 0; k < cols1; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return true;
    }

    private boolean checkEqualSizeOfTwoMatrix() {
        return !(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length);
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getSizeOfRow1() {
        return sizeOfRow1;
    }

    public int getSizeOfCol1() {
        return sizeOfCol1;
    }

    public int getSizeOfRow2() {
        return sizeOfRow2;
    }

    public int getSizeOfCol2() {
        return sizeOfCol2;
    }
}
