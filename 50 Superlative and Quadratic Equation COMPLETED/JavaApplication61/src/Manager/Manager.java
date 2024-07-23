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
public class Manager {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Double> arr = new ArrayList<>();
    
    public static void calculateEquation() {
        System.out.println("----- Calculate Equation -----");
        double a=0, b=0, ketQua=0;        
        a=Validation.checkDoubleInput("Enter A: ");
        b=Validation.checkDoubleInput("Enter B: ");
        ketQua=b/a;
        System.out.println("Solution: "+ketQua);
        arr.add(a);
        arr.add(b);
        arr.add(ketQua);
        System.out.print("Number is Odd: ");
        for (int i=0;i<arr.size();i++) {
            if (Validation.checkOdd(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println("");
        System.out.print("Number is Even: ");
        for (int i=0;i<arr.size();i++) {
            if (Validation.checkEven(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println("");
        for (int i=0;i<arr.size();i++) {
            if (Validation.perfectSquare(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }        System.out.println("");
    }
    
    public static void calculateQuadraticEquation() {
        System.out.println("----- Calculate Quadratic Equation -----");
        double a=0, b=0, c=0, delta=0,x1=0, x2=0;        
        a=Validation.checkDoubleInput("Enter A: ");
        b=Validation.checkDoubleInput("Enter B: ");
        c=Validation.checkDoubleInput("Enter C: ");
        delta=b*b-4*a*(c);
        System.out.print("Solution: ");
        if (delta>0) {
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.printf("x1 = %.3f and x2 = %.3f",x1,x2);            
        }
        else if (delta<0) {
            System.out.print("There is no solution");
        }
        else {
            x1=x2=-b/(2*a);
            System.out.printf("x1 = %.3f and x2 = %.3f",x1,x1);            
        }
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(x1);
        arr.add(x2);
        System.out.println("");
        System.out.print("Number is Odd: ");
        for (int i=0;i<arr.size();i++) {
            if (Validation.checkOdd(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println("");
        System.out.print("Number is Even: ");
        for (int i=0;i<arr.size();i++) {
            if (Validation.checkEven(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println("");
        System.out.print("Number is Perfect Sqaure: ");
        for (int i=0;i<arr.size();i++) {
            if (Validation.perfectSquare(arr.get(i))) {
                System.out.print(arr.get(i)+" ");
            }
        }
        System.out.println();
    }
    
    
}
