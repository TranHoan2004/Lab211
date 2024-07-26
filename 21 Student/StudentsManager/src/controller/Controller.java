/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Report;
import entity.Students;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private Input input;
    private final Manager manager;

    public Controller() {
        this.manager = new Manager();
    }

    public void createStudents() throws Exception {
        input = new Input();
        Students std = input.getStudents();
        manager.addStudents(std);
    }

    public ArrayList<Students> findAndSortByName() throws Exception {
        String name = Validation.getStringByRegex("Name: ", "^[A-Za-z ]+", "Do not have special characters or digits");
        ArrayList<Students> result = manager.findSortedListOfStudents(name);
        if (result.isEmpty()) {
            throw new Exception("Do not have any student that have this name");
        }
        return result;
    }

    public void updateOrDelete() throws Exception {
        String id = Validation.getStringByRegex("Student's id: ", "SE[0-9]{6}", "Must follow the format [SE******]");
        if (!manager.isIdOfStudentExisted(id)) {
            throw new Exception("This id is not existed");
        }
        String menu = """
                      Do you want to update (U) or delete (D) student?
                      """;
        boolean answer = Validation.getOption(menu, "Only U/u and D/d", "[UDud]");
        Students student = input.getStudents();
        if (!manager.updateList(answer, student)) {
            throw new Exception("Cannot update students information");
        }
    }

    public ArrayList<Report> report() {
        return manager.getReport();
    }

    public ArrayList<Students> getList() {
        return manager.getList();
    }
}
