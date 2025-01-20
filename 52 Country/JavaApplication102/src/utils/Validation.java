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

    public static int getInt(String mess, String errorNumberFormat, String errorOutOfRange, int min, int max) throws Exception {
        int ret = Integer.parseInt(getStringByRegex(mess, "[0-9]+", errorNumberFormat));
        if (ret < min || ret > max) {
            throw new Exception(errorOutOfRange);
        } else {
            return ret;
        }
    }

    public static float getFloat(String msg, String error, double min, double max) throws Exception {
        float input = Float.parseFloat(getStringByRegex(msg, "[0-9]*\\.?[0-9]+", error));
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
            throw new Exception("Not null");
        } else if (string.matches(regex)) {
            return string;
        } else {
            throw new Exception(err);
        }
    }
}
