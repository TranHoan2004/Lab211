/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DoctorManager {
    private Doctor doctor;
    private ArrayList<Doctor> list;

    public DoctorManager() {
        this.doctor = new Doctor();
        this.list = new ArrayList<>();
    }
    
    public void setList(Doctor doctor) throws Exception {
        if (isExisted(doctor)) {
            throw new Exception("This doctor is existed");
        }
        list.add(doctor); 
    }
    public void updateInformationOfDoctor(Doctor doctor) throws Exception {
        if (!isExisted(doctor)) {
            throw new Exception("This doctor is not existed");
        }
        
    }
    private boolean isExisted(Doctor doctor) {
        for (Doctor d: list) {
            if (d == doctor) {
                return true;
            }
        }
        return false;
    }
}
