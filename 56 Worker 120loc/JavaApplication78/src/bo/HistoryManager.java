/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class HistoryManager {

    private final ArrayList<History> listOfHistory;

    public HistoryManager() {
        this.listOfHistory = new ArrayList<>();
    }

    public ArrayList<History> getHistory() {
        return listOfHistory;
    }

    public void addToList(History.Status status, Worker worker, float salary) {
        Worker w = new Worker(worker.getId(), worker.getName(), worker.getWorkLocation(), worker.getAge(), worker.getSalary());
        History history = new History(status, w, salary);
        listOfHistory.add(history);
    }
}
