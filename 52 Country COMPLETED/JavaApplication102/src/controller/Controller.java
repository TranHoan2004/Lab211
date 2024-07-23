/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.CountryInput;
import bo.CountryManager;
import entity.Country;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private final CountryManager manager;
    private CountryInput input;

    public Controller() {
        this.manager = new CountryManager();
    }

    public void addCountryInformation() throws Exception {
        int count = 0;
        while (count != 11) {
            ++count;
            this.input = new CountryInput();
            Country country = input.getCountry();
            manager.addToList(country);
        }
    }

    public ArrayList<Country> getRecentlyEnteredInformation() {
        return manager.getRecentlyEnteredInformation();
    }

    public ArrayList<Country> searchInformationByName() throws Exception {
        String name = Validation.getStringByRegex("Enter name of country: ", "[A-Za-z ]+", "Only letters and spaces");
        if (manager.searchInformationByName(name).isEmpty()) { 
            throw new Exception("There is no country that has this name");
        }
        return manager.searchInformationByName(name);
    }

    public ArrayList<Country> sortInformationByAscendingOrder() {
        return manager.sortInformationByAscendingOrder();
    }

    public ArrayList<Country> getList() {
        return manager.getRecentlyEnteredInformation();
    }
}
