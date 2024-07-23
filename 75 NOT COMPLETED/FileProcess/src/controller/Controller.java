/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final Manager manager;
    private final Input input;

    public Controller() {
        this.manager = new Manager();
        this.input = new Input();
    }

    public boolean checkInputPath() throws Exception {
        input();
        switch (manager.checkPath()) {
            case 0 -> throw new Exception("Path does not exist");
            case 1 -> {
                return true;
            }
            case 2 -> {
                return false;
            }
            default -> throw new AssertionError();
        }
    }

    public int getByTypeJava() throws Exception {
        input();
        try {
            ArrayList<String> list = manager.getJavaFile();
            if (list == null) {
                return 0;
            } else {
                return list.size();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void getBySize() {
        input();
    }

    public void writeToFile() {
        input();
    }

    public void readAndCountCharacters() {
        input();
    }

    private void input() {
        String path = input.getPath();
        manager.setFile(path);
    }
}
