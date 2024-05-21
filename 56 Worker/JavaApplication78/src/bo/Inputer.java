/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import utils.ValidationAndNormalization;

/**
 *
 * @author ADMIN
 */
public class Inputer {

    private Worker worker;

    public Inputer() {
        worker = new Worker();
    }

    public Worker getWorker() {
        return worker;
    }

    private void inputWorkerInformation() {
        worker.setId(ValidationAndNormalization.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit"));
        worker.setName(ValidationAndNormalization.getStringByRegex("Enter Name: ", "^[A-Z][a-z]*$", "Not null or name must have the first character is upper case"));
        worker.setAge(ValidationAndNormalization.checkInputInRange("Enter Age: ", "Age must be in range from 18 to 50", 18, 50));
        worker.setWorkLocation(ValidationAndNormalization.getStringByRegex("Enter work location: ", "^[A-Z][a-z]*$", "Place's name does not hava any digit"));
        worker.setSalary(ValidationAndNormalization.getDouble("Enter salary: ", "Must be a number!", 1, 1000000));
    }

    public void callInputer() {
        inputWorkerInformation();
    }
}
