/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.WorkerInput;
import bo.WorkerManager;
import entity.History;
import entity.History.Status;
import entity.Worker;
import utils.Validation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class ManagerController {

    private final WorkerManager manager;

    public ManagerController() {
        this.manager = new WorkerManager();
    }

    public List<Worker> getList() {
        return manager.getList();
    }

    public List<History> getHistory() {
        return manager.getHistory();
    }

    public void createWorker() throws Exception {
        WorkerInput input = new WorkerInput();
        Worker work = input.getWorker();
        manager.addWorker(work);
    }

    public void changeSalary(boolean type) throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Code must begin with an upper case and following by a digit");
        double amount = Validation.getDouble("Amount: ", "Must be a positive number", 1, Double.MAX_VALUE);
//        if (type) {
//            worker = manager.changeSalary(Status.UP, code, amount);
//        } else if (!type) {
//            worker = manager.changeSalary(Status.DOWN, code, amount);
//        }
        // doan code tren tuong duong voi doan code duoi
        Worker worker = type ? manager.changeSalary(Status.UP, code, amount) : manager.changeSalary(Status.DOWN, code, amount);
        manager.addToList(Status.UP, worker, 0);
    }
}
