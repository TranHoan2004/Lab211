/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import java.util.ArrayList;
import utils.ValidationAndNormalizationTextUtil;

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

    public boolean addWorker(Worker worker) throws Exception {
        if (worker == null) {
            throw new Exception("Worker cannot be null");
        }
        while (true) {
            input.callInputer(1);
            Worker w = input.getWorker();
            try {
                if (ValidationAndNormalizationTextUtil.checkItemExist(w.getId(), listOfWorker)) {
                    throw new Exception();
                } else {
                    listOfWorker.add(new Worker(w.getId(), w.getName(), w.getWorkLocation(), w.getAge(), w.getSalary()));
                }
            } catch (Exception e) {
                System.out.println("ID is existed, worker will not be added");
            }
            show(listOfWorker);
            if (!ValidationAndNormalizationTextUtil.checkYN()) {
                break;
            }
        }
        return true;
    }

    public void changeSalary(String status) {
        String code = null;
        while (true) {
            try {
                code = input.getCode();
                if (!ValidationAndNormalizationTextUtil.checkItemExist(code, listOfWorker)) {
                    throw new Exception();

                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("ID is not existed");
            }
        }
        double amount = input.callInputer(2);
        switch (status) {
            case "up":
                increaseSalary(amount, code);
                break;
            case "down":
                decreaseSalary(amount, code);
                break;
        }
    }

    public void show(ArrayList<Worker> worker) {
        System.out.printf("""
                          -------------------- Display Worker Information -----------------------
                          %-15s%-15s%-15s%-15s%-15s
                          """, "Code", "Name", "Age", "Salary", "Work Location");
        for (Worker person : worker) {
            System.out.printf("%-15s%-15s%-15d%-15.2f%s", person.getId(), person.getName(), person.getAge(), person.getSalary(), person.getWorkLocation());
            System.out.println();
        }
        System.out.println();
    }

    private void increaseSalary(double amount, String code) {
        findWorkerInformationByID(code, listOfWorker, '+', amount);
        String status = "UP";
        display(listOfWorker, status);
    }

    private void decreaseSalary(double amount, String code) {
        findWorkerInformationByID(code, listOfWorker, '-', amount);
        String status = "DOWN";
        display(listOfWorker, status);
    }

    public void getInformationSalary() {

    }

    public void display(ArrayList<Worker> worker, String status) {
        System.out.printf("""
                          -------------------- Display Information Salary -----------------------
                          %-15s%-15s%-15s%-15s%-15s%-15s
                          """, "Code", "Name", "Age", "Salary", "Status", "Date");
        for (Worker person : worker) {
            System.out.printf("%-15s%-15s%-15d%-15.2f%s", person.getId(), person.getName(), person.getAge(), person.getSalary(), status);
            System.out.println();
        }
        System.out.println();
    }

    public boolean findWorkerInformationByID(String id, ArrayList<Worker> worker, char type, double amount) {
        for (Worker person : listOfWorker) {
            if (id.equalsIgnoreCase(person.getId())) {
                switch (type) {
                    case '+':
                        person.setSalary(person.getSalary() + amount);
                        break;
                    case '-':
                        person.setSalary(person.getSalary() - amount);
                        break;
                }
            }
        }
        return false;
    }
}
