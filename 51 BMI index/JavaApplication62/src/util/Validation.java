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
    private static Scanner sc = new Scanner(System.in);
    
    public static int checkInputChoice(String msg, int min, int max, String err) {
        while (true) {
            try {
                System.out.print(msg);
                int n=Integer.parseInt(sc.nextLine().trim());
                if (n<min || n>max) throw new NumberFormatException();
                return n;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public static double getDouble(String msg, String err) {
        double n=0;
        while (true) {
            try {
                System.out.print(msg);
                n=Double.parseDouble(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public static String checkOperator(String msg, String err) {
        String op;
        while (true) {
            try {
                System.out.print(msg);
                op=sc.nextLine().trim();
                if (op.isEmpty()){
                    System.out.println("Operator should not be empty!");
                }
                else if (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-") 
                        || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/") 
                        || op.equalsIgnoreCase("^") || op.equalsIgnoreCase("=")) {
                    return op;
                }
                else System.out.println(err);
            } catch (InputMismatchException e) {
                System.out.println(err);
            }            
        }
    }
}
