/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.NumberInputer;
import bo.NumberSystemManager;

/**
 *
 * @author ADMIN
 */
public class ManagerController {
    private NumberSystemManager manager = new NumberSystemManager();
    private NumberInputer input = new NumberInputer();
    public void convertDec(int type) {
        switch (type) {
            case 1:
                input.getDouble();
                
                break;
            case 2:
                break;
            case 3: 
                break;
        }
    }
    public void convertBinary(int type) {
        
    }
    public void convertHex(int type) {
        
    }
}
