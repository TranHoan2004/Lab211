/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private double answer;
    private double bmi;

    public double getAnswer() {
        return answer;
    }

    public double getBMI() {
        return bmi;
    }

    public boolean normalCalculator(double a, double b, String operator) {
        switch (operator) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                if (checkDiv(b)) {
                    return false;
                }
                answer = a / b;
                break;
            case "^":
                answer = Math.pow(a, b);
                break;
            case "=":
                answer = a;
                break;
        }
        return true;
    }

    public boolean bmiCalculator(double weight, double height) {
        bmi = weight / (height * height / 10000);
        return true;
    }

    public boolean checkDiv(double b) {
        return b == 0;
    }
}
