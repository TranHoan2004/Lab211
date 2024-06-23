/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }

    public static int getInt(String mess, String errorNumberFormat, String errorOutOfRange, int min, int max) {
        while (true) {
            int ret = Integer.parseInt(getStringByRegex(mess, "[0-9]+", errorNumberFormat));
            if (ret < min || ret > max) {
                System.err.println(errorOutOfRange);
            } else {
                return ret;
            }
        }

    }

    public static boolean checkYN() {
        String input = getStringByRegex("Y/N: ", "[YNyn]", "[YNyn]");
        return input.toLowerCase().equalsIgnoreCase("y");
    }

    public static String getStringByRegex(String msg, String regex, String err) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            String string = removeUnneccessaryBlank(sc.nextLine());
            if (string.isEmpty()) {
                System.err.println("Not null");
            } else if (string.matches(regex)) {
                return string;
            } else {
                System.err.println(err);
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

    public static String getNameByItem(ArrayList<Fruit> list, int item) {
        String name = null;
        for (Fruit fruit : list) {
            if (list.indexOf(fruit) == item) {
                name = fruit.getFruitName();
            }
        }
        return name;
    }

    public static int getQuantityByItem(ArrayList<Fruit> list, int item) {
        int quantity = 0;
        for (Fruit fruit : list) {
            if (list.indexOf(fruit) == item) {
                quantity = fruit.getQuantity();
            }
        }
        return quantity;
    }
}
