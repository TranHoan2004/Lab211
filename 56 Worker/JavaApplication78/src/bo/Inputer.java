/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Inputer {

    private final Worker worker;

    public Inputer() {
        worker = new Worker();
    }

    public Worker inputWorker() {
        worker.setId(Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit"));
        worker.setName(Validation.getStringByRegex("Enter Name: ", "^[A-Z][a-z]*$", "Not null or name must have the first character is upper case"));
        worker.setAge(Validation.checkInputInRange("Enter Age: ", "Age must be in range from 18 to 50", 18, 50));
        worker.setWorkLocation(Validation.getStringByRegex("Enter work location: ", "^[A-Z][a-z]*$", "Place's name does not hava any digit"));
        worker.setSalary(Validation.getDouble("Enter salary: ", "Must be a number!", 1, 1000000));
        return worker;
    }
}
