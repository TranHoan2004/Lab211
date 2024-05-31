/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import util.Validation;

/**
 *
 * @author ADMIN
 */
public class Manager {

    public double normalCalculator(double a, double b, String operator) {
        double ketQua = 1;
        while (true) {
            switch (operator) {
                case "+":
                    ketQua = a + b;
                    return ketQua;
                case "-":
                    ketQua = a - b;
                    return ketQua;
                case "*":
                    ketQua = a * b;
                    return ketQua;
                case "/":
                    ketQua = a / b;
                    return ketQua;
                case "^":
                    ketQua = Math.pow(a, b);
                    return ketQua;
                case "=":
                    ketQua = a;
                    return ketQua;
            }
        }
    }

    public void bmiCalculator(double weight, double height) {
        double BMI = 0;
        BMI = weight / (height * height / 10000);
        if (BMI < 19) {
            System.out.println("BMI Status: UNDER_STANDARD");
        } else if (BMI >= 19 && BMI <= 25) {
            System.out.println("BMI Status: STANDARD");
        } else if (BMI >= 25 && BMI <= 30) {
            System.out.println("BMI Status: OVERWEIGHT");
        } else if (BMI >= 30 && BMI <= 40) {
            System.out.println("BMI Status: FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
        } else if (BMI > 40) {
            System.out.println("BMI Status: VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
        }
        System.out.println("");
    }
}
