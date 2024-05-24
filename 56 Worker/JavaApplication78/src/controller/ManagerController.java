/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Inputer;
import bo.Manager;
import entity.Worker;
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
//        ArrayList<Worker> listOfWorker = manager.getList();
        for (Worker person : manager.getList()) {
            System.out.println(person.toString());
        }
        System.out.println();
    }

    public Worker getList() {
//        ArrayList<Worker> listOfWorker = manager.getList();
        Worker w1 = manager.findByID(manager.getList());
        return w1;
    }

    public void increaseSalary() throws Exception {
        Worker w = getList();
        if (w == null) {
            throw new Exception();
        }
        double amount = Validation.getDouble("Amount: ", "Must be a number", 1, Double.MAX_VALUE);
        manager.increaseSalary(amount, w);
    }

    public void decreareSalary(Worker w) throws Exception {
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
