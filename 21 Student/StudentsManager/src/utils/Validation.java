/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 * @author ADMIN
 */
public class Validation {

    public static String removeUnnecessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static int getInt(String msg, String error, int min, int max) throws Exception {
        int input = Integer.parseInt(getStringByRegex(msg, "[0-9]+", error));
        if (input < min || input > max) {
            throw new Exception("Out of range!");
        } else {
            return input;
        }
    }

    public static String getStringByRegex(String msg, String regex, String err) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String string = removeUnnecessaryBlank(sc.nextLine());
        if (string.isEmpty()) {
            throw new Exception("Not null!");
        } else if (string.matches(regex)) {
            return string;
        } else {
            throw new Exception(err);
        }
    }

    public static boolean checkYN() throws Exception {
        String input = getStringByRegex("Do you want to continue (Y/N): ", "[YNyn]", "Y/N only!");
        return input.equalsIgnoreCase("y");
    }

    public static boolean getOption(String msg, String err, String regex) throws Exception {
        String option = getStringByRegex(msg, regex, err);
        return option.equalsIgnoreCase("u");
    }
}
