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
public class WorkerInput {

    private final Worker worker;

    public WorkerInput() {
        this.worker = new Worker();
    }

    public Worker getWorker() throws Exception {
        worker.setId(Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Code must begin with an upper case and following by a digit"));
        worker.setName(Validation.getStringByRegex("Enter Name: ", "^[A-Za-z ]+", "Name must begin with an upper case and following by lower cases"));
        worker.setAge(Validation.getInt("Enter Age: ", "Age must be in range from 18 to 50", 18, 50));
        worker.setWorkLocation(Validation.getStringByRegex("Enter work location: ", "^[A-Za-z ]+", "Only words!"));
        worker.setSalary(Validation.getDouble("Enter salary: ", "Must be a number!", 1, 1000000));
        return worker;
    }
}
