/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Manager;
import entity.Worker;
import utils.ValidationAndNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private Manager manager;
    private Worker worker;

    public ManagerController() {
        manager = new Manager();
        worker = new Worker();
    }

    public void addWorker() throws Exception {
        try {
            boolean result = manager.addWorker(worker);
            if (result) {
                System.out.println("Added successfully!");
            }
            else {
                System.out.println("Failed to add worker");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getInformationSalary() {

    }

    public void upSalary() {
        manager.changeSalary("up");
    }

    public void downSalary() {
        manager.changeSalary("down");

    }
}
