/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication55;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    
    public static int checkInput() {
        while (true) {
            try {
                int n=Integer.parseInt(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Error");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static int Input() {
        System.out.println("Enter number of array:");
        int size=checkInput();
        int[] array = new int[size];
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
