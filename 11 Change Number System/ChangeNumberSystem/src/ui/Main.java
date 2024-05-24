/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String binaryString = "1011.01001100110011001101";
        double decimalValue = binaryToDecimal(binaryString);
        System.out.println("Giá trị thập phân của " + binaryString + " là " + decimalValue);
    }
        public static double binaryToDecimal(String binary) {
        Stack<Double> stack = new Stack<>();
        int len = binary.length();

        for (int i = 0; i < len; i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                stack.push(Math.pow(2, -(i + 1)));
            }
        }

        double result = 0.0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
