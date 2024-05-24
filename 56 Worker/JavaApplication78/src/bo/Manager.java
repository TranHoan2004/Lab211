/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.History;
import entity.Worker;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Worker> listOfWorker = new ArrayList<>();
    private final ArrayList<History> listOfHistory = new ArrayList<>();

    public ArrayList<Worker> getList() {
        return listOfWorker;
    }

    public ArrayList<History> getHistory() {
        return listOfHistory;
    }

    public boolean createWorker(Worker work) {
        if (Validation.checkItemExist(work.getId(), listOfWorker)) {
            return false;
        } else {
            listOfWorker.add(work);
        }
        return true;
    }

    public void increaseSalary(double amount, Worker w1) {
        w1.setSalary(w1.getSalary() + amount);
        listOfHistory.add(new History("UP", w1.getId(), w1.getName(), w1.getWorkLocation(), w1.getAge(), w1.getSalary()));
    }

    public boolean decreaseSalary(double amount, Worker w1) {
        w1.setSalary(w1.getSalary() - amount);
        listOfHistory.add(new History("DOWN", w1.getId(), w1.getName(), w1.getWorkLocation(), w1.getAge(), w1.getSalary()));
        return true;
    }

    public Worker findByID(ArrayList<Worker> listOfWorker) {
        while (true) {
            try {
                String code = Validation.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit");
                for (Worker person : listOfWorker) {
                    if (code.equalsIgnoreCase(person.getId())) {
                        return person;
                    }
                }
            } catch (Exception e) {
                System.out.println("ID is not existed");
            }
        }
    }

    public boolean checkAmount(double amount, double salary) {
        return amount <= salary;
    }
}
