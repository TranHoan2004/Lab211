/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ValidationAnNormalizationTextUtil {
    private static Scanner sc = new Scanner(System.in);
    public static int checkInputValue() {
        while(true) {
            try {
                int size=Integer.parseInt(sc.nextLine().trim());
                return size;
            }
            catch (InputMismatchException e) {
                System.out.println("Error!");
                System.out.print("Enter again: ");
            }
        }
    }
}
