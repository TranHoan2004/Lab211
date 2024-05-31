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

    private Fruit fr = new Fruit();

    public Fruit input() {
        fr.setFruitID(Validation.checkInputString("Enter Fruits ID: ", "Not empty"));
        fr.setFruitName(Validation.checkInputString("Enter Fruits Name: ", "Not empty"));
        fr.setPrice(Validation.checkInputDouble("Enter Fruits Price: ", "Please enter an integer number"));
        fr.setQuantity(Validation.checkInputInt("Enter Fruits Quantities: ", "Please enter a number"));
        fr.setOrigin(Validation.checkInputString("Enter Fruits Origin: ", "Not empty"));
        return fr;
    }
}
