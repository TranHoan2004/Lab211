/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

/**
 *
 * @author ADMIN
 */
public class Manager {
    
    public static void normalCalculator() {
        double a=0, b=0, ketQua=1;
        String operator=null;
        System.out.println("----- Normal Calculator -----");
        a=Validation.checkInput("Enter number: ", "Please enter a number");
        do {             
            operator=Validation.checkOperator("Enter Operator: ", "Please input (+,-,*,/,^)");      
            switch (operator) {
                case "+":
                    b=Validation.checkInput("Enter number: ", "Please enter a number");
                    a=a+b;
                    System.out.printf("Memory: %.1f", a);
                    System.out.println("");
                    break;
                case "-":
                    b=Validation.checkInput("Enter number: ", "Please enter a number");
                    a=a-b;
                    System.out.printf("Memory: %.1f", a);
                    break;
                case "*":
                    b=Validation.checkInput("Enter number: ", "Please enter a number");
                    a=a*b;
                    System.out.printf("Memory: %.1f", a);
                    break;
                case "/":
                    b=Validation.checkInput("Enter number: ", "Please enter a number");
                    a=a/b;
                    System.out.printf("Memory: %.1f", a);
                    break;
                case "^":
                    b=Validation.checkInput("Enter number: ", "Please enter a number");
                    a=Math.pow(a, b);
                    System.out.printf("Memory: %.1f", a);
                    break;
                case "=":
                    System.out.println("Memory: "+a);
                    System.out.println("");
                    return;                
            }          
        } while (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") 
                || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/") 
                || operator.equalsIgnoreCase("^"));
    }
    
    public static void bmiCalculator() {
        double weight=0, height=0, BMI=0;
        System.out.println("----- BMI Calculator -----");
        weight=Validation.checkInput("Enter Weight(kg): ", "BMI is digit");
        height=Validation.checkInput("Enter Height(cm): ", "BMI is digit");
        BMI=weight/(height*height/10000);
        if (BMI < 19) {
            System.out.println("BMI Status: UNDER_STANDARD");
        }
        else if (BMI>=19 && BMI <=25) {
            System.out.println("BMI Status: STANDARD");
        }
        else if (BMI>=25 && BMI <=30) {
            System.out.println("BMI Status: OVERWEIGHT");
        }
        else if (BMI>=30 && BMI <=40) {
            System.out.println("BMI Status: FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
        }
        else if (BMI>40) {
            System.out.println("BMI Status: VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
        }
        System.out.println("");
    }
}
