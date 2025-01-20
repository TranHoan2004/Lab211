/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.DoctorInput;
import bo.DoctorManager;
import entity.Doctor;
import java.util.ArrayList;
import java.util.List;

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

    public void update() throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "[A-Za-z0-9 ]+", "Do not have special characters");
        String name = Validation.getStringByRegex("Enter Name: ", "[A-Za-z ]+", "Do not have any digits and special characters");
        String specialization = Validation.getStringByRegex("Enter Specialization: ", "[A-Za-z ]+", "Do not have any digits and special characters");
        int availability = Validation.getInt("Enter Availability: ", "Only one number", "Out of range", 1, 100);
        manager.updateInformationOfDoctor(code, name, specialization, availability);
    }

    public void delete() throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "[A-Za-z0-9 ]+", "Do not have special characters");
        manager.deleteDoctor(code); 
    }

    public List<Doctor> search() throws Exception {
        String text = input.getCode();
        return manager.searchDoctor(text);
    }
    
    public List<Doctor> getListOfDoctor() {
        return manager.getList();
    }
}
