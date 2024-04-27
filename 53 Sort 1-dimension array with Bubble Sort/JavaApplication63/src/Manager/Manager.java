/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {
    public static int[] array=null;
    
    public static void intputElement() {
        int size=0;
        System.out.println("----- Input Element -----");
        System.out.println("Input Length Of Array");
        size=Validation.checkInput("Enter Number: ", "Please input numberand number is greater than zero");
        array = new int[size];
        for (int i=0;i<size;i++) {
            array[i]=Validation.checkInput("Enter number "+(i+1)+": ", "Please input an integer number");
        }
    }
    
    public static int[] sortAscending(int[] array, int size) {
        for (int i=0;i<size;i++) {
            for (int y=0;y<size-i-1;y++) {
                if (array[y]>array[y+1]) {
                    int temp=array[y];
                    array[y]=array[y+1];
                    array[y+1]=temp;
                }
            }
        }
        System.out.println();
        return array;
    }
    
    public static int[] sortDescending(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int y = size - 1; y > i; y--) {
                if (array[y] > array[y - 1]) {
                    int temp = array[y];
                    array[y] = array[y - 1];
                    array[y - 1] = temp;
                }
            }
        }
        System.out.println();
        return array;
    }
    
    public static void printAscendingArray() {
        sortAscending(array, array.length);
        System.out.println("----- Ascending -----");
        for (int i=0;i<array.length;i++) {
            if (i==array.length-1) {
                System.out.printf("[%d]",array[i]);
                break;
            }
            System.out.printf("[%d]->",array[i]);
        }
        System.out.println("");
    }
    
    public static void printDescendingArray() {
        sortDescending(array, array.length);
        System.out.println("----- Descending -----");
        for (int i=0;i<array.length;i++) {
            if (i==array.length-1) {
                System.out.printf("[%d]",array[i]);
                break;
            }
            System.out.printf("[%d]<-",array[i]);
        }
        System.out.println("");
    }
}
