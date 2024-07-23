/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.ManagerController;
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
    //main
    public static void main(String[] args) {
        // TODO code application logic here
        ManagerController managerController = new ManagerController();
        int kichCo = managerController.inputSizeOfArray();
        int[] array = managerController.inputArray(kichCo);
        managerController.sort(array);
        managerController.printArray(array);
    }

}
