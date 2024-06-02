/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {

    public static String removeUnneccessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }

    public static String getStringByRegex(String msg, String regex, String err) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            String string = sc.nextLine();
            if (string.matches(regex)) {
                return string;
            } else {
                System.err.println(err);
            }
        }
    }

    public static int getInt(String msg, int min, int max, String err) {
        while (true) {
            try {
                int n = Integer.parseInt(getStringByRegex(msg, "[0-9]+", err));
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Out of range");
            }
        }
    }

    public static double getDouble(String msg, String err) {
        while (true) {
            double input = Double.parseDouble(getStringByRegex(msg, "[0-9]*\\.?[0-9]+", err));
            if (input <= 0 || input > Double.MAX_VALUE) {
                System.err.println("Out of range!");
            } else {
                return input;
            }
        }
    }

    public static String checkOperator(String msg, String err) {
        while (true) {
            String op = getStringByRegex(msg, "^[+*/=-]{1}$", err);
            if (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")
                    || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/")
                    || op.equalsIgnoreCase("^") || op.equalsIgnoreCase("=")) {
                return op;
            }
        }
    }
}
