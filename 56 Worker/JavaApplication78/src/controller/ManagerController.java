/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Inputer;
import bo.Manager;
import entity.Worker;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private final Manager manager = new Manager();

    public void addWorker() throws Exception {
        Inputer input = new Inputer();
        Worker work = input.inputWorker();
        if (!manager.createWorker(work)) {
            throw new Exception();
        }
    }

    public void show() {
        for (Worker person : manager.getList()) {
            System.out.println(person.toString());
        }
        System.out.println();
    }

    public Worker getWorker() {
        Worker w = manager.findByID(manager.getList());
        return w;
    }

    public void increaseSalary() throws Exception {
        Worker w = getWorker();
        if (w == null) {
            throw new Exception();
        }
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        manager.increaseSalary(amount, w);
    }

    public void decreareSalary() throws Exception {
        Worker w = getWorker();
        if (w == null) {
            System.out.println("Cannot change salary because there is no workers in the list");
            return;
        }
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        if (!manager.checkAmount(amount, w.getSalary())) {
            throw new Exception();
        }
        manager.decreaseSalary(amount, w);
    }

    public void display() {
        manager.getHistory().forEach(person -> {
            System.out.println(person.displaySalaryInformation());
        });
    }
}
