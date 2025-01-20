/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class DoctorInput {

    private final Doctor doctor;

    public DoctorInput() {
        this.doctor = new Doctor();
    }

    public Doctor getDoctor() throws Exception {
        doctor.setCode(Validation.getStringByRegex("Enter Code: ", "[A-Za-z0-9 ]+", "Do not have special characters"));
        doctor.setName(Validation.getStringByRegex("Enter Name: ", "[A-Za-z ]+", "Do not have any digits and special characters"));
        doctor.setSpecialization(Validation.getStringByRegex("Enter Specialization: ", "[A-Za-z ]+", "Do not have any digits and special characters"));
        doctor.setAvailability(Validation.getInt("Enter Availability: ", "Only one number", "Out of range", 1, 100));
        return doctor;
    }
    
    public String getCode() throws Exception {
        return Validation.getStringByRegex("Enter Code: ", "[A-Za-z0-9 ]+", "Do not have special characters");
    }
}
