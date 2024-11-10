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

    public static String removeUnnecessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
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
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            String string = removeUnnecessaryBlank(sc.nextLine());
            if (string.isEmpty()) {
                System.err.println("Not null!");
            }
            else if (string.matches(regex)) {
                return string;
            } else {
                System.err.println(err);
            }
        }
    }

    public static boolean checkYN() {
        String input = getStringByRegex("Do you want to continue (Y/N): ", "[YNyn]", "Y/N only!");
        return input.equalsIgnoreCase("y");
    }
}
