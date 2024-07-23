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
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static String removeUnneccessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static int getInt(String msg, String error, int min, int max) {
        while (true) {
            int input = Integer.parseInt(getStringByRegex(msg, "[0-9]+", error));
            if (input < min || input > max) {
                System.err.println("Out of range!");
            } else {
                return input;
            }
        }
    }

    public static double getDouble(String msg, String error, double min, double max) {
        while (true) {
            double input = Double.parseDouble(getStringByRegex(msg, "[0-9]*\\.?[0-9]+", error));
            if (input < min || input > max) {
                System.err.println("Out of range!");
            } else {
                return input;
            }
        }
    }

    public static String getStringByRegex(String msg, String regex, String err) {
        while (true) {
            System.out.print(msg);
            String string = removeUnneccessaryBlank(sc.nextLine());
            if ("".equals(string)) {
                System.err.println("Not null!");
            } else if (string.matches(regex)) {
                return string;
            } else {
                System.err.println(err);
            }
        }
    }

    public static boolean checkYN() {
        String input = getStringByRegex("Do you want to continue (Y/N): ", "[YNyn]", "Y/N only!");
        return input.toLowerCase().equalsIgnoreCase("y");
    }

    public static String getAccountNumber(String msg, String regErr, String otherErr) {
        while (true) {
            String number = getStringByRegex(msg, "[0-9]+", regErr);
            if (number.length() == 10) {
                return number;
            } else {
                System.err.println(otherErr);
            }
        }
    }

    public static String getPassword(String msg, String regErr, String otherErr) {
        while (true) {
            String password = getStringByRegex(msg, ".+", regErr);
            if (password.length() >= 8 && password.length() <= 31) {
                return password;
            } else {
                System.err.println(otherErr);
            }
        }
    }
}
