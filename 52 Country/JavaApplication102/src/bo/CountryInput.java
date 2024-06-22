/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.EastAsiaCountries;
import entity.Country;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class CountryInput {

    private final Country country;

    public CountryInput() {
        this.country = new Country();
    }

    public Country getCountry() {
        country.setCountryCode(Validation.getStringByRegex("Enter code of country: ", "[A-Z]+", "Only uppercase letters"));
        country.setCountryName(Validation.getStringByRegex("Enter name of country: ", "[A-Za-z ]+", "Only letters and spaces"));
        country.setTotalArea(Validation.getFloat("Enter total area: ", "Only positive numbers", 1, Float.MAX_VALUE));
        country.setCountryTerrain(Validation.getStringByRegex("Enter terrain of country: ", "[A-Za-z]+", "Only letters"));
        return country;
    }
}
