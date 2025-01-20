/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.CountryInput;
import bo.CountryManager;
import entity.Country;
import utils.Validation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Controller {
    private final CountryManager manager;

    public Controller() {
        this.manager = new CountryManager();
    }

    public void addCountryInformation() throws Exception {
        CountryInput input;
        int count = 0;
        while (count != 11) {
            ++count;
            input = new CountryInput();
            Country country = input.getCountry();
            manager.addToList(country);
        }
    }

    public List<Country> getRecentlyEnteredInformation() {
        return new ArrayList<>(manager.getRecentlyEnteredInformation());
    }

    public List<Country> searchInformationByName() throws Exception {
        String name = Validation.getStringByRegex("Enter name of country: ", "[A-Za-z ]+", "Only letters and spaces");
        List<Country> listOfCountry = manager.searchInformationByName(name);
        if (listOfCountry.isEmpty()) throw new Exception("There is no country that has this name");
        return listOfCountry;
    }

    public List<Country> sortInformationByAscendingOrder() {
        return manager.sortInformationByAscendingOrder();
    }
}
