/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Fruit;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private Manager manager = new Manager();

    public void addFruit() throws Exception {
        Input input = new Input();
        Fruit fr = input.getFruit();
        manager.createFruit(fr);
    }

    public ArrayList<Fruit> getFruit() {
        return manager.getListOfFruit();
    }
}
