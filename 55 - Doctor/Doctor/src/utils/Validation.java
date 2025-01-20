/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public static boolean checkYN() throws Exception {
        String input = getStringByRegex("Y/N: ", "[YNyn]", "[YNyn]");
        return input.equalsIgnoreCase("y");
    }
}
