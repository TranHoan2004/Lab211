/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller c = new Controller();
        System.out.println("Enter number of array:");
        int size = c.getSize();
        int[] arr = c.getArray(size);
        print(arr, "Unsorted: ");
        print(c.sort(arr), "Sorted: ");
    }

    public static void print(int[] arr, String mss) {
        System.out.print(mss);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}