/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication52 {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    //kiem tra kieu
    public static int checkInput() {
        while (true) {
            try {
                int size=Integer.parseInt(sc.nextLine().trim());
                return size;
            } catch (NumberFormatException e) {
                System.out.println("Error!");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //nhap kich co cua mang
    public static int inputSizeOfArray() {
        System.out.print("size=");
        int size=checkInput();
        return size;
    }
    
    public static int[] inputValuesOfArray(int size) {
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++) {
            System.out.print("a["+i+"]=");
            arr[i]=checkInput();
        }
        return arr;
    }
    
    //SORT
    public static void selectionSort(int[] arr) {
        System.out.print("Unsorted array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++) {
            int min=i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
    }
        
    //PRINT
    public static void print(int[] arr) {
        System.out.print("Sorted: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number of array:");  
        int size=inputSizeOfArray();
        int[] arr = inputValuesOfArray(size);
        selectionSort(arr);
        print(arr);
    }
    
}
