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
public class WorkerManager {

    private final ArrayList<Worker> listOfWorker;
    private final ArrayList<History> listOfHistory;

    public WorkerManager() {
        this.listOfWorker = new ArrayList<>();
        this.listOfHistory = new ArrayList<>();
    }

    public ArrayList<Worker> getList() {
        return listOfWorker;
    }

    public ArrayList<History> getHistory() {
        return listOfHistory;
    }

    public void addWorker(Worker work) throws Exception {
        if (isExist(work.getId())) {
            throw new Exception("ID is existed");
        }
        listOfWorker.add(work);
    }

    public void increaseSalary(double amount, String code) throws Exception {
        Worker worker = findByID(code);
        worker.setSalary(worker.getSalary() + amount);
        listOfHistory.add(new History(Status.UP, worker));
    }

    public void decreaseSalary(double amount, String code) throws Exception {
        Worker worker = findByID(code);
        if (amount > worker.getSalary()) {
            throw new Exception("Amount is larger than salary, salary of waorker cannot be changed");
        }
        worker.setSalary(worker.getSalary() - amount);
        listOfHistory.add(new History(Status.DOWN, worker));
    }

    private Worker findByID(String id) throws Exception {
        for (Worker person : listOfWorker) {
            if (id.equalsIgnoreCase(person.getId())) {
                return person;
            }
        }
        throw new Exception("Worker has this id is not existed");
    }

    private boolean isExist(String id) {
        for (Worker person : listOfWorker) {
            if (person.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
