/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ValidationAndNormalizationTextUtil {

    public static String removeUnneccessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }

    public static int checkInputInRange(String msg, String error, int min, int max) {
        while (true) {
            int input = Integer.parseInt(getStringByRegex(msg, "[0-9]+", error));
            if (input < min || input > max) {
                System.out.println("Out of range!");
            }
            else return input;
        }
    }
    
    public static String getStringByRegex(String msg, String regex, String err) {
        Scanner sc = new Scanner(System.in);
        String string = null;
        while (true) {
            System.out.print(msg);
            string = sc.nextLine();
            if (string.matches(regex)) {
                return string;
            } else {
                System.out.println(err);
            }
        }
    }
    
    public static boolean checkEqualSizeOfTwoMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }
}
