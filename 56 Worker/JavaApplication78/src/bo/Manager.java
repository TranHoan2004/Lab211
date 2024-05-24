/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.History;
import entity.Worker;
import java.time.LocalDate;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private ArrayList<Worker> listOfWorker = new ArrayList<>();
    private ArrayList<History> history = new ArrayList<>();

    public ArrayList<Worker> getList() {
        return listOfWorker;
    }

    public boolean createWorker(Worker work) {
        if (Validation.checkItemExist(work.getId(), listOfWorker)) {
            return false;
        } else {
            listOfWorker.add(work);
        }
        return true;
    }

    public ArrayList<History> increaseSalary(double amount, Worker w1) {
        w1.setSalary(w1.getSalary() + amount);
        history.add(new History("UP", w1.getId(), w1.getName(), w1.getWorkLocation(), w1.getAge(), w1.getSalary()));
        return history;
    }

    public ArrayList<History> decreaseSalary(double amount, Worker w1) {
        w1.setSalary(w1.getSalary() - amount);
        history.add(new History("DOWN", w1.getId(), w1.getName(), w1.getWorkLocation(), w1.getAge(), w1.getSalary()));
        return history;
    }

    public ArrayList<History> getHistory() {
        return history;
    }
}
