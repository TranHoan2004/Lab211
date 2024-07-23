/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Matrix {

    private int row;
    private int col;
    private int[][] value;

    public Matrix() {
    }

    public Matrix(int[][] matrix) {
        this.value = matrix;
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.value = new int[row][col];
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getSize() {
        return getValue().length;
    }

    private boolean isTheSameSize(Matrix m2) throws Exception {
        if (getSize() != m2.getSize()) {
            throw new Exception("Two matrix must have the same size");
        }
        for (int i = 0; i < getSize(); i++) {
            if (getValue()[i].length != m2.getValue()[i].length) {
                throw new Exception("Two matrix must have the same size");
            }
        }
        return true;
    }

    private Matrix compute(Matrix m2, boolean compute) throws Exception {
        int[][] resultMatrix = new int[getRow()][getCol()];
        if (isTheSameSize(m2)) {
            for (int i = 0; i < getRow(); i++) {
                for (int j = 0; j < getCol(); j++) {
                    if (compute) {
                        resultMatrix[i][j] = getValue()[i][j] + m2.getValue()[i][j];
                    } else if (!compute) {
                        resultMatrix[i][j] = getValue()[i][j] - m2.getValue()[i][j];
                    }
                }
            }
        }
        return new Matrix(resultMatrix);
    }

    public Matrix additionTwoMatrices(Matrix m2) throws Exception {
        return compute(m2, true);
    }

    public Matrix substractTwoMatrices(Matrix m2) throws Exception {
        return compute(m2, false);
    }

    public Matrix multiplyTwoMatrices(Matrix m2) throws Exception {
        if (getCol() != m2.getRow()) {
            throw new Exception("Size of column of the first matrix must equal to size of row of the second matrix");
        }
        int[][] resultMatrix = new int[getRow()][m2.getCol()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < m2.getCol(); j++) {
                for (int k = 0; k < getCol(); k++) {
                    resultMatrix[i][j] += getValue()[i][k] * m2.getValue()[k][j];
                }
            }
        }
        return new Matrix(resultMatrix);
    }
}
