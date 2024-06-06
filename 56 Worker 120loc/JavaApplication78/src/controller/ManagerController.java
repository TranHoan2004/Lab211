/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.History;
import entity.Worker;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final Manager manager = new Manager();

    public ArrayList<Worker> getList() {
        return manager.getList();
    }

    public ArrayList<History> getHistory() {
        return manager.getHistory();
    }

    public void addWorker() throws Exception {
        do {
            Input input = new Input();
            Worker work = input.getWorker();
            if (!manager.createWorker(work)) {
                throw new Exception("ID is existed, worker will not be added");
            }
        } while (Validation.checkYN());
    }

    public void changeSalary(int choice) throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit");
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        switch (choice) {
            case 2 -> {
                if (!manager.increaseSalary(amount, code)) {
                    throw new Exception("ID is not existed");
                }
            }
            case 3 -> {
                if (!manager.decreaseSalary(amount, code)) {
                    throw new Exception("Amount is greater than salary or id is not existed, cannot be decreased");
                }
            }
        }
    }
}
