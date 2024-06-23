/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Order {

//    private String fruitID;
//    private String fruitName;
//    private int quantity;
//    private double price;
//
//    public Order() {
//    }
//
//    public Order(String fruitID, String fruitName, int quantity, double price) {
//        this.fruitID = fruitID;
//        this.fruitName = fruitName;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    public String getFruitID() {
//        return fruitID;
//    }
//
//    public void setFruitID(String fruitID) {
//        this.fruitID = fruitID;
//    }
//
//    public String getFruitName() {
//        return fruitName;
//    }
//
//    public void setFruitName(String fruitName) {
//        this.fruitName = fruitName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
    private Fruit fruit;
    private int quantity;
    private double price;

    public Order(Fruit fruit, int quantity, double price) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.price = price;
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
