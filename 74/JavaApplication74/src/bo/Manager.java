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
public class Manager {

    private Inputer input;

    public Manager() {
        input = new Inputer();
    }

    public void additionMatrix() {
        System.out.println("\n-------Addition-------");
        int[][] matrix1 = null,
                matrix2 = null;
        int sizeOfRow1 = 0,
                sizeOfCol1 = 0,
                sizeOfRow2 = 0,
                sizeOfCol2 = 0;
        while (true) {
            try {
                sizeOfRow1 = input.inputRowOfMatrix(1);
                sizeOfCol1 = input.inputColOfMatrix(1);
                matrix1 = input.inputMatrix1(sizeOfRow1, sizeOfCol1);
                sizeOfRow2 = input.inputRowOfMatrix(2);
                sizeOfCol2 = input.inputColOfMatrix(2);
                matrix2 = input.inputMatrix2(sizeOfRow2, sizeOfCol2);
                if (ValidationAndNormalizationTextUtil.checkEqualSizeOfTwoMatrix(matrix1, matrix2)) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("2 matrices do not have the same size");

            }
        }
        System.out.println("\n-------Result-------\n");
        printMatrix1(matrix1, sizeOfRow1, sizeOfCol1);
        System.out.println("+");
        printMatrix2(matrix2, sizeOfRow2, sizeOfCol2);
        System.out.println("=");
        for (int i = 0; i < sizeOfRow1; i++) {
            for (int j = 0; j < sizeOfCol1; j++) {
                System.out.print("[" + (matrix1[i][j] + matrix2[i][j]) + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void subtractionMatrix() {
        System.out.println("\n-------Subtraction-------");
        int[][] matrix1 = null,
                matrix2 = null;
        int sizeOfRow1 = 0,
                sizeOfCol1 = 0,
                sizeOfRow2 = 0,
                sizeOfCol2 = 0;
        while (true) {
            try {
                sizeOfRow1 = input.inputRowOfMatrix(1);
                sizeOfCol1 = input.inputColOfMatrix(1);
                matrix1 = input.inputMatrix1(sizeOfRow1, sizeOfCol1);
                sizeOfRow2 = input.inputRowOfMatrix(2);
                sizeOfCol2 = input.inputColOfMatrix(2);
                matrix2 = input.inputMatrix2(sizeOfRow2, sizeOfCol2);
                if (ValidationAndNormalizationTextUtil.checkEqualSizeOfTwoMatrix(matrix1, matrix2)) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("2 matrices do not have the same size");

            }
        }
        System.out.println("\n-------Result-------\n");
        printMatrix1(matrix1, sizeOfRow1, sizeOfCol1);
        System.out.println("-");
        printMatrix2(matrix2, sizeOfRow2, sizeOfCol2);
        System.out.println("=");
        for (int i = 0; i < sizeOfRow1; i++) {
            for (int j = 0; j < sizeOfCol1; j++) {
                System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void multiplicationMatrix() {
        System.out.println("\n-------Multiplication-------");
        int[][] matrix1 = null,
                matrix2 = null;
        int sizeOfRow1 = 0,
                sizeOfCol1 = 0,
                sizeOfRow2 = 0,
                sizeOfCol2 = 0;
        sizeOfRow1 = input.inputRowOfMatrix(1);
        sizeOfCol1 = input.inputColOfMatrix(1);
        matrix1 = input.inputMatrix1(sizeOfRow1, sizeOfCol1);
        sizeOfRow2 = input.inputRowOfMatrix(2);
        sizeOfCol2 = input.inputColOfMatrix(2);
        matrix2 = input.inputMatrix2(sizeOfRow2, sizeOfCol2);
        System.out.println("\n-------Result-------\n");
        printMatrix1(matrix1, sizeOfRow1, sizeOfCol1);
        System.out.println("+");
        printMatrix2(matrix2, sizeOfRow2, sizeOfCol2);
        System.out.println("=");
        multipliTwoMatrice(matrix1, matrix2);
        System.out.println();
    }

    public void printMatrix1(int[][] matrix1, int sizeOfRow, int sizeOfCol) {
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfCol; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void printMatrix2(int[][] matrix2, int sizeOfRow, int sizeOfCol) {
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfCol; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void multipliTwoMatrice(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length,
                cols1 = matrix1[0].length,
                cols2 = matrix2[0].length;

        // Tạo ma trận kết quả
        int[][] result = new int[rows1][cols2];

        // Thực hiện phép nhân ma trận
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public void selectOption(int type) {
        switch (type) {
            case 1:
                additionMatrix();
                break;
            case 2:
                subtractionMatrix();
                break;
            case 3:
                multiplicationMatrix();
                break;
        }
    }
}
