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
        if (!manager.addWorker(work)) {
            throw new Exception("ID is existed, worker will not be added");
        }
    }

    public void changeSalary(int choice) throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("List of worker is null, cannot be changed");
        }
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
