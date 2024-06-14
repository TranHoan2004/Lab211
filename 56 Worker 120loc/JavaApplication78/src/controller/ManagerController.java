/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.WorkerInput;
import bo.WorkerManager;
import entity.History;
import entity.Worker;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final WorkerManager manager = new WorkerManager();

    public ArrayList<Worker> getList() {
        return manager.getList();
    }

    public ArrayList<History> getHistory() {
        return manager.getHistory();
    }

    public void createWorker() throws Exception {
        WorkerInput input = new WorkerInput();
        Worker work = input.getWorker();
        manager.addWorker(work);
    }

    public void changeSalary(int choice) throws Exception {
        if (getList().isEmpty()) {
            throw new Exception("List of worker is null, cannot be changed");
        }
        String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit");
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        switch (choice) {
            case 2 -> {
                manager.increaseSalary(amount, code);
            }
            case 3 -> {
                manager.decreaseSalary(amount, code);
            }
        }
    }
}
