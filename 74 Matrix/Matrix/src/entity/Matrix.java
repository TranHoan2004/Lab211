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
}
