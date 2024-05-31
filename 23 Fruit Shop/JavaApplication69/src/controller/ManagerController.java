/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Fruit;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ManagerController {

    private Manager manager = new Manager();

    public ArrayList<Fruit> addFruit() throws Exception {
        Input input = new Input();
        Fruit fr = new Fruit();
        fr = input.input();
        if (!manager.createFruit(fr)) {
            throw new Exception("ID is existed, cannot be create");
        }
        ArrayList<Fruit> list = manager.getList();
        return list;
    }
}
