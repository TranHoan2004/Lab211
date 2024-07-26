/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    private static Scanner sc = new Scanner(System.in);
    public static int checkInput(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.print(msg);
                n=Integer.parseInt(sc.nextLine());
                if (n<min|| n>max) throw new NumberFormatException();
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please type the integer number from "+min+"->"+max);
            }
        }
    }
        
    public static Double checkDoubleInput(String msg) {
        double n;
        while (true) {
            try {
                System.out.print(msg);
                n=Double.parseDouble(sc.nextLine()); 
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
        }
    }
    
    public static boolean checkOdd(double a) {
        if (a%2==1 || a%2==-1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkEven(double a) {
        if (a%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean perfectSquare(double number) {
        double sqrt=Math.sqrt(number);
        if (sqrt==Math.floor(sqrt)) {
           return true;
        }
        else {
            return false;
        }
    }
    
    
}
