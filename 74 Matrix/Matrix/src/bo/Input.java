/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Matrix;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

//    private int[][] matrix;
    private Matrix matrix;

    public Input() {
//        this.matrix = new Matrix();
    }

//    public int[][] getMatrix() {
//        return matrix;
//    }
//    public void inputValueOfMatrix(int order, int row, int col) {
//        matrix = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                String message = "Enter Matrix" + order + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:";
//                matrix[i][j] = Validation.getInt(message, "Values of matrix must be the number", Integer.MIN_VALUE, Integer.MAX_VALUE);
//            }
//        }
//    }
    public Matrix getMatrix(int order) {
        matrix = new Matrix();
        matrix.setRow(Validation.getInt("Enter Row Matrix " + order + ":", "Values of matrix must be the number", 1, 50)); 
        matrix.setCol(Validation.getInt("Enter Column Matrix " + order + ":", "Values of matrix must be the number", 1, 50)); 
        int[][] matrix1 = new int[matrix.getRow()][matrix.getCol()];
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                String message = "Enter Matrix" + order + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:";
                matrix1[i][j] = Validation.getInt(message, "Values of matrix must be the number", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        matrix.setValue(matrix1);
        return matrix;
    }
}
