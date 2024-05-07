/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Object.Fruit;
import Object.Order;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
    public static int checkInputChoice(String msg, String err, int min, int max) {
        int choice=0;
        while (true) {
            try {
                System.out.print(msg);
                choice=Integer.parseInt(sc.nextLine());
                if (choice<min || choice>max) throw new NumberFormatException();
                else return choice;                
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public static boolean checkYN(String msg, String err) {
        String ans;
        String ansInLowerCase;
        while (true) {
            try {
                System.out.print(msg);
                ans=sc.nextLine().trim();
                ansInLowerCase=ans.toLowerCase();
                if (ansInLowerCase.equalsIgnoreCase("y")) return true;
                else if (ansInLowerCase.equalsIgnoreCase("n")) return false;
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println(err);
            }
        }
    }
    
    public static String checkInputString(String msg, String err) {
        String input;
        while (true) {
            try {
                System.out.print(msg);
                input=sc.nextLine().trim();
                if (input.isEmpty()) throw new InputMismatchException();
                else return input;
            } catch (InputMismatchException e) {
                System.out.println(err);
            }
        }
    }
    
    public static double checkInputDouble(String msg, String err) {
        double input;
        while (true) {            
            try {
                System.out.print(msg);
                input=Double.parseDouble(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public static int checkInputInt(String msg, String err) {
        int input;
        while (true) {            
            try {
                System.out.print(msg);
                input=Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    public static boolean checkItemExistOrder(ArrayList<Order> listOrder, String id)
    {
        for (Order order: listOrder) {
            if (order.getFruitID().equalsIgnoreCase(id))
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkItemExistFruit(ArrayList<Fruit> listOrder, String id, String name)
    {
        for (Fruit order: listOrder) {
            if (order.getFruitID().equalsIgnoreCase(id)||
                    order.getFruitName().equalsIgnoreCase(name)||
                    (order.getFruitID().equalsIgnoreCase(id)&&order.getFruitName().equalsIgnoreCase(name)))
            {
                return true;
            }
        }
        return false;
    }
}
