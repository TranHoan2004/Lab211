/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 * @author ADMIN
 */
public class BmiManager {

    private double weight;
    private double height;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bmiCalculator() {
        return weight / (height * height / 10000);
    }
}
