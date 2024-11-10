/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Circle;
import entity.Rectangle;
import entity.Triangle;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Input input;
    private final Manager manager;

    public Controller() {
        this.input = new Input();
        this.manager = new Manager();
    }

    public void inputInformation() throws Exception {
        input.addInformation();
    }

    public Rectangle getSizeOfRectangle() {
        Rectangle rec = input.getRectangleWithSize();
        manager.setRec(rec);
        return manager.getRectangle();
    }

    public Circle getSizeOfCircle() {
        Circle cir = input.getCircleWithRadius();
        manager.setCircle(cir);
        return manager.getCircle();
    }

    public Triangle getSizeOfTriangle() {
        Triangle tri = input.getTriangleWithSides();
        manager.setTriangle(tri);
        return manager.getTriangle();
    }
}
