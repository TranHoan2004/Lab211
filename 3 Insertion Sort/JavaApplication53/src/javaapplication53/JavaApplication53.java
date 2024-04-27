/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication53 {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    //kiem tra dau vao
    public static int checkInput() {
        while (true) {
            try {
                int n=Integer.parseInt(sc.nextLine().trim());
                return n;
            }catch (NumberFormatException e) {
                System.out.println("Error");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //SIZE
    public static int sizeOfArray() {
        System.out.print("size=");
        int size=checkInput();
        return size;
    }
    
    //ARRAY
    public static int[] array(int size) {
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("a["+i+"]=");
            arr[i]=checkInput();
        }
        return arr;
    }
    
    //inserted sort
    public static void InsertedSort(int[] arr) {
        //unsorted array
        System.out.print("Unsorted array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println();
    }
    
    //PRINT
    public static void print(int[] arr) {
        System.out.print("Sorted array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number of array:");
        int size=sizeOfArray();
        int[] arr=array(size);
        InsertedSort(arr);
        print(arr);
    }
    
}
