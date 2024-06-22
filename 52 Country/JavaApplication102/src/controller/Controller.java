/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.CountryInput;
import bo.CountryManager;
import entity.EastAsiaCountries;
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

    public void addCountryInformation(int count) throws Exception {
        this.input = new CountryInput();
        EastAsiaCountries country = input.getCountry();
        manager.addToList(country);
    }

    public ArrayList<EastAsiaCountries> getRecentlyEnteredInformation() {
        return manager.getRecentlyEnteredInformation();
    }

    public ArrayList<EastAsiaCountries> searchInformationByName() throws Exception {
        String name = Validation.getStringByRegex("Enter name of country: ", "[A-Za-z ]+", "Only letters and spaces");
        return manager.searchInformationByName(name); 
    }

    public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder() {
        ArrayList<EastAsiaCountries> list = manager.sortInformationByAscendingOrder();
        return list;
    }
    public ArrayList<EastAsiaCountries> getList() {
        return manager.getRecentlyEnteredInformation();
    }
}
