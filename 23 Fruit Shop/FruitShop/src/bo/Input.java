/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Fruit;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Fruit fruit;

    public Input() {
        this.fruit = new Fruit();
    }
   
    public Fruit getFruit() throws Exception {
        fruit.setFruitID(Validation.getStringByRegex("Enter Fruits ID: ", "[A-Za-z0-9]+", "Not empty"));
        fruit.setFruitName(Validation.getStringByRegex("Enter fruit's name: ", "[A-Za-z]+", "Not null"));
        fruit.setPrice(Validation.getDouble("Enter Fruits Price: ", "Please enter an integer number", 1, Double.MAX_VALUE));
        fruit.setQuantity(Validation.getInt("Enter Fruits Quantities: ", "Only a number", "Please enter a number", 1, Integer.MAX_VALUE));
        fruit.setOrigin(Validation.getStringByRegex("Enter Fruits Origin: ", "[A-Za-z ]+", "Not empty"));
        return fruit;
    }
}
