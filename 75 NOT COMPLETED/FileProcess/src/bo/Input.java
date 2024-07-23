/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    public Input() {
    }
    
    public String getPath() {
        return Validation.getStringByRegex("Enter Path: ", "^[a-zA-Z0-9_-]+\\.[a-zA-Z]+$", "File name invalid");
    }
}
