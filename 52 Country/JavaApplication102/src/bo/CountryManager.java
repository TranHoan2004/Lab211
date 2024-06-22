/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Country;
import entity.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class CountryManager {

    private final ArrayList<EastAsiaCountries> list;

    public CountryManager() {
        this.list = new ArrayList<>();
    }

    public void addToList(EastAsiaCountries country) throws Exception {
        if (isExisted(country)) {
            throw new Exception("This country is already existed");
        }
        list.add(country);
    }

    public ArrayList<EastAsiaCountries> searchInformationByName(String name) throws Exception {
        ArrayList<EastAsiaCountries> listOfCountry = new ArrayList<>();
        for (EastAsiaCountries country : list) {
            if (country.getCountryName().toUpperCase().contains(name.toUpperCase())
                    || country.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                listOfCountry.add(country);
            }
        }
        if (listOfCountry.isEmpty()) {
            throw new Exception("There is no country that has this name");
        }
        return listOfCountry;
    }

    public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder() {
        ArrayList<EastAsiaCountries> cloneCountry = new ArrayList<>();
        cloneCountry = (ArrayList) list.clone();
        Comparator<EastAsiaCountries> ct = new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        };
        Collections.sort(cloneCountry, ct);
        return cloneCountry;
    }

    public ArrayList<EastAsiaCountries> getRecentlyEnteredInformation() {
        return list;
    }

    private boolean isExisted(EastAsiaCountries country) {
        for (EastAsiaCountries c : list) {
            if (c == country) {
                return true;
            }
        }
        return false;
    }
}
