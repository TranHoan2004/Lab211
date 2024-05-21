/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Manager;
import entity.Worker;
import java.util.ArrayList;
import utils.ValidationAndNormalization;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private Manager manager;
    private Worker worker;
    private ArrayList<Worker> listOfWorker;

    public ManagerController() {
        manager = new Manager();
        worker = new Worker();
        listOfWorker = new ArrayList();
    }

    public void addWorker() {
        while (true) {
            manager.addWorker();
            if (!ValidationAndNormalization.checkYN()) {
                break;
            }
        }        
    }

    public void upSalary() {
        manager.changeSalary("up");
    }

    public void downSalary() {
        manager.changeSalary("down");
    }
    public void getInformation() {
        listOfWorker = manager.getSalaryInformation();
        manager.display(listOfWorker);
    }
}
