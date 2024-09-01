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
public class Validation {

    public static int getInteger(String mss) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mss);
        while (true) {
            try {
                int size = Integer.parseInt(sc.nextLine().trim());
                return size;
            } catch (InputMismatchException e) {
                System.out.println("Must input an integer!");
            }
        }
    }
}
