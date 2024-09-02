/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Double> oddNumber;
    private final ArrayList<Double> evenNumber;
    private final ArrayList<Double> perfectSquare;

    public Manager() {
        this.oddNumber = new ArrayList<>();
        this.evenNumber = new ArrayList<>();
        this.perfectSquare = new ArrayList<>();
    }

    public String solveEquation(double a, double b) {
        oddNumber.clear();
        evenNumber.clear();
        perfectSquare.clear();
        double answer = -b / a;
        addToList(a, b, answer);
        addToListOfPerfectSquare(a);
        addToListOfPerfectSquare(b);
        addToListOfPerfectSquare(answer);
        return String.format("x = %.3f", answer);
    }

    public String solveQuadraticEquation(double a, double b, double c) {
        oddNumber.clear();
        evenNumber.clear();
        perfectSquare.clear();
        double delta = b * b - 4 * a * (c);
        double x1, x2;
        addToListOfPerfectSquare(a);
        addToListOfPerfectSquare(b);
        addToListOfPerfectSquare(c);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            addToList(a, b, x1);

            //solve with c
            if (!isEven(c)) {
                oddNumber.add(c);
            } else {
                evenNumber.add(c);
            }

            //solve with x2
            if (!isEven(x2)) {
                oddNumber.add(x2);
            } else {
                evenNumber.add(x2);
            }

            addToListOfPerfectSquare(x1);
            addToListOfPerfectSquare(x2);
            return String.format("x1 = %.3f and x2 = %.3f", x1, x2);
        } else if (delta < 0) {
            return null;
        } else {
            x1 = -b / (2 * a);
            addToList(a, b, x1);

            //solve with c
            if (!isEven(c)) {
                oddNumber.add(c);
            } else {
                evenNumber.add(c);
            }

            addToListOfPerfectSquare(x1);
            return String.format("x1 = %.3f", x1);
        }
    }

    public ArrayList<Double> getOdd() {
        return oddNumber;
    }

    public ArrayList<Double> getEven() {
        return evenNumber;
    }

    public ArrayList<Double> getPerfectSquare() {
        return perfectSquare;
    }

    private boolean isEven(double x) {
        return x % 2 == 0;
    }

    private void addToList(double a, double b, double answer) {
        //solve with a
        if (!isEven(a)) {
            oddNumber.add(a);
        } else {
            evenNumber.add(a);
        }
        //solve with b
        if (!isEven(b)) {
            oddNumber.add(b);
        } else {
            evenNumber.add(b);
        }

        //solve with answer
        if (!isEven(answer)) {
            oddNumber.add(answer);
        } else {
            evenNumber.add(answer);
        }
    }

    private boolean isPerfectSquare(double number) {
        double sqrt = Math.sqrt(number);
        return sqrt == Math.floor(sqrt);
    }

    private void addToListOfPerfectSquare(double a) {
        if (isPerfectSquare(a)) {
            perfectSquare.add(a);
        }
    }
}
