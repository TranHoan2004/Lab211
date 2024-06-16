/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Matrix;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private Matrix matrix_1;
    private Matrix matrix_2;
    private Matrix matrix; //ma tran ket qua

    public Manager() {
        this.matrix_1 = new Matrix();
        this.matrix_2 = new Matrix();
        this.matrix = new Matrix();
    }
    
    public void setMatrix_1(Matrix matrix_1) {
        this.matrix_1 = matrix_1;
    }

    public void setMatrix_2(Matrix matrix_2) {
        this.matrix_2 = matrix_2;
    }

    public void additionMatrix() throws Exception {
        if (!checkEqualSizeOfTwoMatrix()) {
            throw new Exception("Two matrix must have the same size");
        }
        this.matrix.setRow(matrix_1.getRow());
        this.matrix.setCol(matrix_1.getCol());
        int[][] matrix = new int[matrix_1.getRow()][matrix_1.getCol()];
        for (int i = 0; i < matrix_1.getRow(); i++) {
            for (int j = 0; j < matrix_1.getCol(); j++) {
                matrix[i][j] = matrix_1.getValue()[i][j] + matrix_2.getValue()[i][j];
            }
        }
        this.matrix.setValue(matrix);
    }

    public void subtractionMatrix() throws Exception {
        if (!checkEqualSizeOfTwoMatrix()) {
            throw new Exception("Two matrix must have the same size");
        }
        matrix.setRow(matrix_1.getRow());
        matrix.setCol(matrix_1.getCol());
        int[][] mt = new int[matrix.getRow()][matrix.getCol()];
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                mt[i][j] = matrix_1.getValue()[i][j] - matrix_2.getValue()[i][j];
            }
        }
        matrix.setValue(mt);
    }

    public void multipliTwoMatrice() throws Exception {
        if (matrix_1.getCol() != matrix_2.getRow()) {
            throw new Exception("Size of column of the first matrix must equal to size of row of the second matrix");
        }
        matrix = new Matrix(matrix_1.getRow(), matrix_2.getCol());
        int[][] mt = new int[matrix.getRow()][matrix.getCol()];
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                for (int k = 0; k < matrix_1.getCol(); k++) {
                    mt[i][j] += matrix_1.getValue()[i][k] * matrix_2.getValue()[k][j];
                }
            }
        }
        matrix.setValue(mt);
    }

    private boolean checkEqualSizeOfTwoMatrix() {
        if (matrix_1.getSize() != matrix_2.getSize()) {
            return false;
        }
        for (int i = 0; i < matrix_1.getSize(); i++) {
            if (matrix_1.getValue()[i].length != matrix_2.getValue()[i].length) {
                return false;
            }
        }
        return true;
    }

    public Matrix getMatrix_1() {
        return matrix_1;
    }

    public Matrix getMatrix_2() {
        return matrix_2;
    }

    public Matrix getMatrix() {
        return matrix;
    }
}
