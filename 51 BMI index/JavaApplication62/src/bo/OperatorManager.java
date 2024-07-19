/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author ADMIN
 */
public class OperatorManager {
    private double answer;
    public OperatorManager() {
        this.answer = 0;
    }    
    public void setNum(double a) {
        this.answer = a;
    }
    public double getAnswer() {
        return answer;
    }
    public enum Type {
        SUM, SUB, MULTI, DIV, POW, EQUAL
    }
    public void normalCalculator(double b, Type operator) throws Exception {
        switch (operator) {
            case SUM:
                answer += b;
                break;
            case SUB:
                answer -= b;
                break;
            case MULTI:
                answer *= b;
                break;
            case DIV:
                if (checkDiv(b)) {
                    throw new Exception("Divisor should be different from 0");
                }
                answer /= b;
                break;
            case POW:
                answer = Math.pow(answer, b);
                break;
            case EQUAL:
                break;
        }
    }
    private boolean checkDiv(double b) {
        return b == 0;
    }
}
