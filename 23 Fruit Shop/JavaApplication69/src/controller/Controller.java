/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Manager manager = new Manager();

    public void addFruit() throws Exception {
        Input input = new Input();
        Fruit fr = input.getFruit();
        manager.createFruit(fr);
    }

    public void shopping(int item) throws Exception {
        int maxQuantity = Validation.getQuantityByItem(manager.getListOfFruit(), item);
        int numberOfFruit = Validation.getInt("Please input quality: ", "Only a positive number", "Out of range", 1, maxQuantity);
        manager.order(numberOfFruit, item);
        String name = Validation.getStringByRegex("Your name: ", "[A-Za-z ]+", "Do not have digits or special characters");

    }

    public ArrayList<Fruit> getFruit() throws Exception {
        if (manager.getListOfFruit().isEmpty()) {
            throw new Exception("List is empty");
        }
        return manager.getListOfFruit();
    }
    
    public ArrayList<Order> getOrder() throws Exception {
        if (manager.getOrder().isEmpty()) {
            throw new Exception("LIst is empty");
        }
        return manager.getOrder();
    }
}
