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
        if (!isExist(work.getId(), listOfWorker)) {
            return listOfWorker.add(work);
        }
        return false;
    }

    public boolean increaseSalary(double amount, String code) {
        Worker worker = findByID(code);
        if (worker == null) {
            return false;
        }
        worker.setSalary(worker.getSalary() + amount);
        return listOfHistory.add(new History(Status.UP, worker)); 
    }

    public boolean decreaseSalary(double amount, String code) {
        Worker worker = findByID(code);
        if (worker == null || (amount > worker.getSalary())) {
            return false;
        }
        worker.setSalary(worker.getSalary() - amount);
        return listOfHistory.add(new History(Status.DOWN, worker)); 
    }

    public Worker findByID(String code) {
        for (Worker person : listOfWorker) {
            if (code.equalsIgnoreCase(person.getId())) {
                return person;
            }
        }
        return null;
    }
    
    public boolean isExist(String id, ArrayList<Worker> listWorker) {
        for (Worker person : listWorker) {
            if (person.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
