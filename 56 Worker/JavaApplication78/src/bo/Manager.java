/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import java.util.ArrayList;
import utils.ValidationAndNormalization;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private Worker worker;
    private ArrayList<Worker> listOfWorker;
    private Inputer input;

    public Manager() {
        worker = new Worker();
        listOfWorker = new ArrayList<>();
        input = new Inputer();
    }
    public ArrayList<Worker> getSalaryInformation() {
        return listOfWorker;
    }
    public void addWorker() {
        input.callInputer();
        Worker w = input.getWorker();
        try {
            if (ValidationAndNormalization.checkItemExist(w.getId(), listOfWorker)) {
                throw new Exception();
            } else {
                listOfWorker.add(new Worker(w.getId(), w.getName(), w.getWorkLocation(), w.getAge(), w.getSalary()));
                System.out.println("Added successfully!");
                show(listOfWorker);
            }
        } catch (Exception e) {
            System.out.println("ID is existed, worker will not be added");
        }
    }

    public void changeSalary(String status) {
        while (true) {
            String code = ValidationAndNormalization.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit");
            try {
                if (!ValidationAndNormalization.checkItemExist(code, listOfWorker)) {
                    throw new Exception();
                } else {
                    worker = ValidationAndNormalization.findWorkerByID(code, listOfWorker);
                    break;
                }
            } catch (Exception e) {
                System.out.println("ID is not existed");
            }
        }
        double amount = ValidationAndNormalization.getDouble("Enter Amount: ", "Must be a positive number", 0, Double.MAX_VALUE);
        switch (status) {
            case "up" ->
                increaseSalary(worker, amount);
            case "down" ->
                decreaseSalary(worker, amount);
        }
    }

    public void show(ArrayList<Worker> worker) {
        System.out.printf("""
                          -------------------- Display Worker Information -----------------------
                          %-15s%-15s%-15s%-15s%-15s
                          """, "Code", "Name", "Age", "Salary", "Work Location");
        for (Worker person : worker) {
            person.displayWorkerInformation();
        }
    }

    private void increaseSalary(Worker worker, double amount) {
        worker.setStatus("UP");
        worker.setSalary(worker.getSalary() + amount);
        display(listOfWorker);
    }

    private void decreaseSalary(Worker worker, double amount) {
        worker.setStatus("DOWN");
        worker.setSalary(worker.getSalary() - amount);
        display(listOfWorker);
    }

    public void display(ArrayList<Worker> worker) {
        System.out.printf("""
                          -------------------- Display Information Salary -----------------------
                          %-15s%-15s%-15s%-15s%-15s%-15s
                          """, "Code", "Name", "Age", "Salary", "Status", "Date");
        for (Worker person : worker) {
            person.displaySalary();
        }
    }
}
