/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.History;
import entity.History.Status;
import entity.Worker;
import java.util.ArrayList;

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
        sort();
        return listOfWorker;
    }

    public ArrayList<History> getHistory() {
        return listOfHistory;
    }

    public void addWorker(Worker work) throws Exception {
        if (isExist(work.getId())) {
            throw new Exception("Id is existed");
        }
        listOfWorker.add(work);
    }
//
    public void increaseSalary(double amount, String code) throws Exception {
        Worker worker = findByID(code);
        if (worker == null) {
            throw new Exception("Worker has this id is not existed");
        }
        worker.setSalary(worker.getSalary() + amount);
        addToList(Status.UP, worker);
    }

    public void decreaseSalary(double amount, String code) throws Exception {
        Worker worker = findByID(code);
        if (worker == null) {
            throw new Exception("Worker has this id is not existed");
        }
        if (amount > worker.getSalary()) {
            throw new Exception("Amount is larger than salary");
        }
        worker.setSalary(worker.getSalary() - amount);
        addToList(Status.DOWN, worker);
    }

//    public void updateSalary(double amount, String code, boolean status) throws Exception {
//        Worker worker = findByID(code);
//        if (worker == null) {
//            throw new Exception("Worker has this id is not existed");
//        }
//        if (status) {
//            worker.setSalary(worker.getSalary() + amount);
//            addToList(Status.UP, worker);
//        } else if (!status) {
//            if (amount > worker.getSalary()) {
//                throw new Exception("Amount is larger than salary");
//            }
//            worker.setSalary(worker.getSalary() - amount);
//            addToList(Status.DOWN, worker);
//        }
//    }

    private void sort() {
        for (int i = 0; i < listOfWorker.size(); i++) {
            for (int j = 0; j < listOfWorker.size() - i - 1; j++) {
                if (listOfWorker.get(j).getId().compareTo(listOfWorker.get(j + 1).getId()) > 0) {
                    Worker temp = listOfWorker.get(j);
                    listOfWorker.set(j, listOfWorker.get(j + 1));
                    listOfWorker.set(j + 1, temp);
                }
            }
        }
    }

    private void addToList(Status status, Worker worker) {
        Worker w = new Worker(worker.getId(), worker.getName(), worker.getWorkLocation(), worker.getAge(), worker.getSalary());
        History history = new History(status, w);
        listOfHistory.add(history);
    }

    private Worker findByID(String id) {
        for (Worker person : listOfWorker) {
            if (id.equalsIgnoreCase(person.getId())) {
                return person;
            }
        }
        return null;
    }

    public boolean isExist(String id) {
        for (Worker person : listOfWorker) {
            if (person.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
