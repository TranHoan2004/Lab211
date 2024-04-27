/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    
    //Nhap vao kich co cua mang
    public static int inputSizeOfArray() {
        int size=0;
        System.out.print("kich co = ");
        size=checkInputValue();
        return size;
    }
    
    //kiem tra dau vao ky tu
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
    
    //Nhap vao mang
    public static int[] inputArray(int size) {
        int[] arr= new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("a["+i+"]=");
            arr[i]=checkInputValue();
        }
        return arr;
    }
    
    //Thuat toan sap xep
    public static void Bubblesort(int[] arr) {   
        System.out.println("Unsorted array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++) {
            for (int y=0;y<arr.length-i-1;y++) {
                if (arr[y]>arr[y+1]) {
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        System.out.println();
    }
    
    //in ket qua
    public static void print(int[] arr) {
        System.out.println("Sorted array:");               
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    //main
    public static void main(String[] args) {
        // TODO code application logic here
        int kichCo=inputSizeOfArray();
        int[] array=inputArray(kichCo);
        Bubblesort(array);
        print(array);
    }
    
}
