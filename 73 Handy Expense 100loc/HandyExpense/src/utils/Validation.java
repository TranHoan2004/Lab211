/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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

    public static double getDouble(String msg, String error, double min, double max) throws Exception {
        double input = Double.parseDouble(getStringByRegex(msg, "[0-9]*\\.?[0-9]+", error));
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
        if (string.matches(regex)) {
            return string;
        } else if (string.isEmpty()) {
            throw new Exception("Not null!");
        } else {
            throw new Exception(err);
        }
    }

    public static boolean checkYN() throws Exception {
        String input = getStringByRegex("Y/N: ", "[YNyn]", "[YNyn]");
        return input.equalsIgnoreCase("y");
    }

    public static String getDate(String message) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOutput = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
        System.out.print(message);
        String result = sc.nextLine().trim();
        Date date = format.parse(result);
        if (result.equalsIgnoreCase(format.format(date))) {
            return formatOutput.format(date);
        }
        throw new Exception("Invalid date. Please re-enter.");
    }
}
