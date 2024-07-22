/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.FruitManager;
import bo.OrderManager;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final FruitManager fruitManager;
    private final OrderManager orderManager;
    private Input input;

    public Controller() {
        this.fruitManager = new FruitManager();
        this.orderManager = new OrderManager();
    }

    public void addFruit() throws Exception {
        input = new Input();
        Fruit fruit = input.getFruit();
        fruitManager.addFruit(fruit);
    }

    public void shopping() throws Exception {
        ArrayList<Order> list = new ArrayList<>();
        do {
            String item = Validation.getStringByRegex("Select item: ", "[A-Za-z0-9]+", "Do not have special characters");
            Fruit fruit = fruitManager.getFruit(item);
            if (fruit == null) {
                throw new Exception("This fruit is not existed");
            }
            int numberOfFruit = Validation.getInt("You seleted: " + fruit.getFruitName() + "\nPlease input quality: ", "Only a positive number", "Out of range", 1, fruit.getQuantity());
            fruitManager.update(fruit, numberOfFruit);
            list = orderManager.createOrder(list, fruit, numberOfFruit);
        } while (Validation.checkYN());
        String name = Validation.getStringByRegex("Your name: ", "[A-Za-z ]+", "Do not have digits or special characters");
        Order order = new Order(name, list);
        orderManager.addToCart(order);
    }

    public ArrayList<Fruit> getListOfFruit() {
        return fruitManager.getListOfFruit();
    }

    public ArrayList<Order> getListOfOrder() {
        return orderManager.getListOfOrder();
    }
}
