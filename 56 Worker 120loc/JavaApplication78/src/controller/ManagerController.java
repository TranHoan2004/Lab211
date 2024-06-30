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

    private final WorkerManager manager;

    public ManagerController() {
        this.manager = new WorkerManager();
    }

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

    public void changeSalary(boolean type) throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Code must begin with an upper case and followinging by a digit");
        if (!manager.isExist(code)) {
            throw new Exception("Id is not existed");
        }
        double amount = Validation.getDouble("Amount: ", "Must be a positive number", 1, Double.MAX_VALUE);
        if (type) {
            manager.increaseSalary(amount, code);
        } else if (!type) {
            manager.decreaseSalary(amount, code);
        }
    }
}
