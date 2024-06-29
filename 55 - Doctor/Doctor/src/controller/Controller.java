/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.DoctorInput;
import bo.DoctorManager;
import entity.Doctor;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final DoctorManager manager;
    private final DoctorInput input;

    public Controller() {
        this.manager = new DoctorManager();
        this.input = new DoctorInput();
    }

    public void createDoctor() throws Exception {
        Doctor doctor = input.getDoctor();
        manager.setList(doctor); 
    }

    public void update() {
        Doctor doctor = input.getDoctor();
    }

    public void delete() {
        String code = Validation.getStringByRegex("Enter Code: ", "[A-Za-z0-9 ]+", "Do not have special characters");
    }

    public void search() {

    }
}
