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

    private Matrix matrix;
    private Matrix m2;

    public Manager() {
        this.m2 = new Matrix();
    }

    public Matrix additionMatrix() throws Exception {
        Matrix m2 = new Matrix(addMatrix()); 
        return matrix.additionTwoMatrices(m2);
    }

    public Matrix subtractionMatrix() throws Exception {
        Matrix m2 = new Matrix(addMatrix()); 
        return matrix.substractTwoMatrices(m2);
    }

    public Matrix multiplicationMatrix() throws Exception {
        Matrix m2 = new Matrix(addMatrix()); 
        return matrix.multiplyTwoMatrices(m2);
    }

    private int[][] addMatrix() {
        Input input = new Input();
        //nhap cho matrix 1
        int[][] matrix1 = input.getMatrix(1);
        this.matrix = new Matrix(matrix1);
        //nhap cho matrix 2
        int[][] matrix2 = input.getMatrix(2);
        this.m2 = new Matrix(matrix2); 
        return matrix2;
    }

    public Matrix getMatrix1() {
        return matrix;
    }

    public Matrix getMatrix2() {
        return m2;
    }
}
