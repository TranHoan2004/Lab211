/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Order {

    private Fruit fruit;
    private int quantity;
    private double price;
    private String name;
    private List<Order> listOfOrder;

    public Order() {
        this.listOfOrder = new ArrayList<>();
    }

    public Order(Fruit fruit, int quantity, double price) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.price = price;
    }

    public Order(String name, ArrayList<Order> list) {
        this.name = name;
        this.listOfOrder.addAll(list);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getListOfOrder() {
        return new ArrayList<>(listOfOrder);
    }

    public void setListOfOrder(ArrayList<Order> listOfOrder) {
        this.listOfOrder.addAll(listOfOrder);
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = getQuantity() * price;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15d%-15.2f%.2f", fruit.getFruitName(), quantity, fruit.getPrice(), price);
    }

}
