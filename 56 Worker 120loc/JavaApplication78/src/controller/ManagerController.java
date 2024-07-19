/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.HistoryManager;
import bo.WorkerInput;
import bo.WorkerManager;
import entity.History;
import entity.History.Status;
import entity.Worker;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final WorkerManager manager;
    private final HistoryManager history;

    public ManagerController() {
        this.manager = new WorkerManager();
        this.history = new HistoryManager();
    }

    public ArrayList<Worker> getList() {
        return manager.getList();
    }

    public ArrayList<History> getHistory() {
        return history.getHistory();
    }

    public void createWorker() throws Exception {
        WorkerInput input = new WorkerInput();
        Worker work = input.getWorker();
        manager.addWorker(work);
    }

    public void changeSalary(boolean type) throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Code must begin with an upper case and followinging by a digit");
        double amount = Validation.getDouble("Amount: ", "Must be a positive number", 1, Double.MAX_VALUE);
        Worker worker = null;
        if (type) {
            worker = manager.changeSalary(Status.UP, code, amount);
        } else if (!type) {
            worker = manager.changeSalary(Status.DOWN, code, amount);
        }
        history.addToList(Status.UP, worker, 0);
    }
}
