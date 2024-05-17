/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import utils.ValidationAndNormalizationTextUtil;

/**
 *
 * @author ADMIN
 */
public class Inputer {

    private Worker worker;

    public Inputer() {
        worker = new Worker();
    }

    public Worker getWorker() {
        return worker;
    }

    private void inputWorkerInformation() {
        worker.setId(ValidationAndNormalizationTextUtil.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit"));
        worker.setName(ValidationAndNormalizationTextUtil.getStringByRegex("Enter Name: ", "^[A-Z][a-z]*$", "Not null or name must have the first character is upper case"));
        worker.setAge(ValidationAndNormalizationTextUtil.checkInputInRange("Enter Age: ", "Age must be in range from 18 to 50", 18, 50));
        worker.setWorkLocation(ValidationAndNormalizationTextUtil.getStringByRegex("Enter work location: ", "^[A-Z][a-z]*$", "Place's name does not hava any digit"));
        worker.setSalary(ValidationAndNormalizationTextUtil.getDouble("Enter salary: ", "Must be a number!", 1, 1000000));
    }

    public double callInputer(int num) {
        switch (num) {
            case 1:
                inputWorkerInformation();
                break;
            case 2:
                double value = getAmount();
                return value;     
        }
        return 0;
    }

    private double getAmount() {
        double amount = ValidationAndNormalizationTextUtil.getDouble("Enter Amount: ", "Must be a positive number", 0, Double.MAX_VALUE);
        return amount;
    }
    public  String getCode() {
        String code = ValidationAndNormalizationTextUtil.getStringByRegex("Enter Code: ", "^[A-Z]+[0-9]+$", "Not null or code must begin with an upper case and followinging by a digit");
        return code;
    }
}
