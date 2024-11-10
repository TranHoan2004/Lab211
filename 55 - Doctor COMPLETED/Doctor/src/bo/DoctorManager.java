/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;

import java.util.ArrayList;

/**
 * @author ADMIN
 */
public class DoctorManager {

    private final ArrayList<Doctor> list;

    public DoctorManager() {
        this.list = new ArrayList<>();
    }

    public void setList(Doctor doctor) throws Exception {
        if (isExisted(doctor)) {
            throw new Exception("This doctor is existed");
        }
        list.add(doctor);
    }

    public void updateInformationOfDoctor(String code, String name, String specialization, int availability) throws Exception {
        Doctor doctor = findDoctor(code);
        if (doctor == null) {
            throw new Exception("This code is not existed");
        }
        for (Doctor d : list) {
            if (d.getCode().equalsIgnoreCase(code)) {
                d.setName(name);
                d.setSpecialization(specialization);
                d.setAvailability(availability);
            }
        }
    }

    public void deleteDoctor(String code) throws Exception {
        Doctor doctor = findDoctor(code);
        if (doctor == null) {
            throw new Exception("This code is not existed");
        }
        list.remove(doctor);
    }

    public ArrayList<Doctor> searchDoctor(String text) {
        ArrayList<Doctor> result = new ArrayList<>();
        int number = 0;
        if (text.matches("[0-9 ]+")) {
            number = Integer.parseInt(text);
        }
        for (Doctor doctor : list) {
            if (doctor.getCode().equalsIgnoreCase(text)
                    || doctor.getName().equalsIgnoreCase(text)
                    || doctor.getSpecialization().equals(text)
                    || doctor.getAvailability() == number) {
                result.add(doctor);
            }
        }
        return result;
    }

    public ArrayList<Doctor> getList() {
        return list;
    }

    private boolean isExisted(Doctor doctor) {
        for (Doctor d : list) {
            if (d == doctor) {
                return true;
            }
        }
        return false;
    }

    private Doctor findDoctor(String code) {
        for (Doctor doctor : list) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }
}
