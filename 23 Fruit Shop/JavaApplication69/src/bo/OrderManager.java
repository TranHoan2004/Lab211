/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Fruit;
import entity.Order;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class OrderManager {

    private final ArrayList<Order> listOfOrder;

    public OrderManager() {
        this.listOfOrder = new ArrayList<>();
    }

    public ArrayList<Order> createOrder(ArrayList<Order> list, Fruit fruit, int numberOfFruit) {
        double amount = fruit.getPrice() * numberOfFruit;
        Order order = new Order(fruit, numberOfFruit, amount);
        list.add(order);
        return list;
    }

    public void addToCart(Order order) { //add 1 loat cac doi tuong order co chua arraylist order
        listOfOrder.add(order);
    }
    
    public ArrayList<Order> getListOfOrder() {
        return listOfOrder;
    }
}
