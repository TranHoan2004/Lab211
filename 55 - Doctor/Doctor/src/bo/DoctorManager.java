/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class DoctorManager {

    private final List<Doctor> list;

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
//        Doctor doctor = findDoctor(code);
//        if (doctor == null) {
//            throw new Exception("This code is not existed");
//        }
//        for (Doctor d : list) {
//            if (d.getCode().equalsIgnoreCase(code)) {
//                d.setName(name);
//                d.setSpecialization(specialization);
//                d.setAvailability(availability);
//            }
//        }
        // co the thay the bang doan code sau
        Doctor d = list.stream().filter(d1 -> d1.getCode().equalsIgnoreCase(code)).findFirst().orElseThrow(() -> new Exception("This code is not existed"));
        d.setName(name);
        d.setSpecialization(specialization);
        d.setAvailability(availability);
    }

    public void deleteDoctor(String code) throws Exception {
//        for (Doctor d : list) {
//            if (d.getCode().equalsIgnoreCase(code)) {
//                list.remove(d);
//                return;
//            }
//        }
//        throw new Exception("This code is not existed");
        // doan code tren co the duoc thay the bang doan code sau:
        Doctor d = list
                .stream()
                .filter(d1 -> d1.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new Exception("This code is not existed"));
        list.remove(d);
    }

    public List<Doctor> searchDoctor(String text) {
        List<Doctor> result = new ArrayList<>();
        int number;
        if (text.matches("[0-9 ]+")) {
            number = Integer.parseInt(text);
        } else {
            number = 0;
        }
//        for (Doctor doctor : list) {
//            if (doctor.getCode().equalsIgnoreCase(text)
//                || doctor.getName().equalsIgnoreCase(text)
//                || doctor.getSpecialization().equals(text)
//                || doctor.getAvailability() == number) {
//                result.add(doctor);
//            }
//        }
        // co the thay the doan code tren bang doan code duoi
        list
                .stream()
                .filter(doctor -> (doctor.getCode().equalsIgnoreCase(text)
                                   || doctor.getName().equalsIgnoreCase(text)
                                   || doctor.getSpecialization().equals(text)
                                   || doctor.getAvailability() == number))
                .forEach(result::add);
        return result;
    }

    public List<Doctor> getList() {
        return new ArrayList<>(list);
    } // tao ban sao cua list

    private boolean isExisted(Doctor doctor) {
//        for (Doctor d : list) {
//            if (d == doctor) {
//                return true;
//            }
//        }
//        return false;
        // co the thay the doan code tren bang doan code duoi
        return list.stream().anyMatch(d -> d == doctor);
    }

    private Doctor findDoctor(String code) {
//        for (Doctor doctor : list) {
//            if (doctor.getCode().equalsIgnoreCase(code)) {
//                return doctor;
//            }
//        }
//        return null;
        // co the thay doi doan code tren bang doan code duoi
        return list
                .stream()
                .filter(doctor -> doctor.getCode().equalsIgnoreCase(code))
                .findFirst().orElse(null);
    }
}
