/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.History;
import entity.History.Status;
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
        }
        listOfWorker.add(work);
        return true;
    }

    public boolean increaseSalary(double amount, String code, int type) {
        Worker w = findByID(code);
        if (w == null) {
            return false;
        }
        w.setSalary(w.getSalary() + amount);
        listOfHistory.add(new History(Status.getStatusByInt(type), w.getId(), w.getName(), w.getWorkLocation(),
                w.getAge(), w.getSalary()));
        return true;
    }

    public boolean decreaseSalary(double amount, String code, int type) {
        Worker w1 = findByID(code);
        if (w1 == null || !checkAmount(amount, w1.getSalary())) {
            return false;
        }
        w1.setSalary(w1.getSalary() - amount);
        listOfHistory.add(new History(Status.getStatusByInt(type), w1.getId(), w1.getName(),
                w1.getWorkLocation(), w1.getAge(), w1.getSalary()));
        return true;
    }

    public Worker findByID(String code) {
        for (Worker person : listOfWorker) {
            if (code.equalsIgnoreCase(person.getId())) {
                return person;
            }
        }
        return null;
    }

    public boolean checkAmount(double amount, double salary) {
        return amount <= salary;
    }
}
