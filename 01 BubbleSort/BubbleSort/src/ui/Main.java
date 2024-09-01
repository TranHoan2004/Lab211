/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.Controller;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //main
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controller = new Controller();
        int kichCo = controller.getSize();
        int[] array = controller.getArray(kichCo);
        controller.sort(array);
        controller.printArray(array);
    }

}
