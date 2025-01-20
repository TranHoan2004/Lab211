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

    public static Integer checkInput(String msg, String regex, String err, int min, int max) {
        while (true) {
            int input = Integer.parseInt(getStringByRegex(msg, regex, err));
            if (input < min || input > max) {
                System.err.println("Out of range!");
            } else {
                return input;
            }
        }
    }
}
