/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Controller;
import entity.Circle;
import entity.Rectangle;
import entity.Triangle;
import utils.Validation;

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
        Controller controller = new Controller();
        do {
            System.out.println("===============Calculator Shape Program===============");
            controller.inputInformation();
            System.out.println("\n===============Rectangle===============");
            Rectangle rec = controller.getSizeOfRectangle();
            System.out.printf("Width: %.f" + rec.getWidth()
                    + "\nLength: %.f" + rec.getLength()
                    + "\nArea: %.f" + rec.getArea()
                    + "\nPerimeter: %.f" + rec.getPerimeter());
            System.out.println("\n================Circle================");
            Circle circle = controller.getSizeOfCircle();
            System.out.printf("Radius: %.f" + circle.getRadius()
                    + "\nArea: " + circle.getArea()
                    + "\nPerimeter: " + circle.getPerimeter());
            System.out.println("\n===============Triangle===============");
            Triangle tri = controller.getSizeOfTriangle();
            System.out.printf("Side A: %.f" + tri.getSideA()
                    + "\nSide B: %.f" + tri.getSideB()
                    + "\nSide C: %.f" + tri.getSideC()
                    + "\nArea: " + tri.getArea()
                    + "\nPerimeter: %.f" + tri.getPerimeter());
        } while (Validation.checkYN());
    }

}
