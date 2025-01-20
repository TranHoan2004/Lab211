/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;

/**
 * @author ADMIN
 */
public class Validation {

    public static String removeUnnecessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static int getInt(String mess, String errorNumberFormat, String errorOutOfRange, int min, int max) throws Exception {
        int ret = Integer.parseInt(getStringByRegex(mess, errorNumberFormat, "[0-9]+"));
        if (ret < min || ret > max) {
            throw new Exception(errorOutOfRange);
        } else {
            return ret;
        }
    }

    public static String getStringByRegex(String mess, String error, String regex) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print(mess);
        String output = removeUnnecessaryBlank(scan.nextLine());
        if (output.isEmpty()) {
            throw new Exception("Not null!");
        } else if (output.matches(regex)) {
            return output;
        } else {
            throw new Exception(error);
        }
    }

    public static String getEmail(String mess) throws Exception {
        String regex = "^[A-Za-z](.*)([@]{1})(.{2,})(\\.)(.{2,})"; //phai bat dau bang chu cai
        return getStringByRegex(mess, "Please enter email with format <account name>@<domain>", regex);
    }

    public static String getPhone(String mess) throws Exception {
        String regex = "[0-9 ]+";
        String phoneNum = getStringByRegex(mess, "Please enter number only!!", regex).replaceAll("\\s+", "");
        if (phoneNum.length() == 10 || phoneNum.length() == 11) {
            return phoneNum;
        } else {
            throw new Exception("Phone number must have 10 characters");
        }
    }

    public static boolean checkYN() throws Exception {
        String input = getStringByRegex("Y/N: ", "[YNyn]", "[YNyn]");
        return input.equalsIgnoreCase("y");
    }

    public static String getDate() throws Exception {
        String result = getStringByRegex("Date: ", "Wrong format", "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(result);
        if (result.equalsIgnoreCase(format.format(date))) {
            return result;
        } else {
            throw new Exception("Re-input");
        }
    }

    public static String getPassword(String msg) throws Exception {
        return getStringByRegex(msg, "Not null", "^[a-zA-Z0-9@#$%^&+=.]+$");
    }

    public static String MD5Encryption(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] hashBytes = md.digest();
        return Base64.getEncoder().encodeToString(hashBytes);
    }
}
