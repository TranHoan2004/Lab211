/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Inputer;
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

    private ArrayList<Worker> listOfWorker = new ArrayList<>();
    private final ArrayList<History> history = new ArrayList<>();
    private final Manager manager = new Manager();

    public ManagerController() {
        listOfWorker = manager.getList();
    }

    public void addWorker() throws Exception {
        Inputer input = new Inputer();
        Worker work = input.inputWorker();
        if (!manager.createWorker(work)) {
            throw new Exception();
        }
    }

    public void show() {
        for (Worker person : listOfWorker) {
            person.toString();
        }
        System.out.println();
    }

    public ArrayList<History> changeSalary(String type) {
        Worker w1 = Validation.findByID(listOfWorker);
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        switch (type) {
            case "UP" ->
                manager.increaseSalary(amount, w1);
            case "DOWN" ->
                manager.decreaseSalary(amount, w1);
        }
        return history;
    }

    public void display() {
        ArrayList<History> his = manager.getHistory();
        his.forEach(person -> {
            person.displaySalaryInformation(person);
        });
        System.out.println();
    }
}
