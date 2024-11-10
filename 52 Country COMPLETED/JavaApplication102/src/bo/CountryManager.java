/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Country;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class CountryManager {

    private final ArrayList<Country> list;

    public CountryManager() {
        this.list = new ArrayList<>();
    }

    public void addToList(Country country) throws Exception {
        if (isExisted(country)) {
            throw new Exception("This country is already existed");
        }
        list.add(country);
    }

    public ArrayList<Country> searchInformationByName(String name) {
        ArrayList<Country> listOfCountry = new ArrayList<>();
        for (Country country : list) {
            if (country.getCountryName().toUpperCase().contains(name.toUpperCase())
                    || country.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                listOfCountry.add(country);
            }
        }
        return listOfCountry;
    }

    public ArrayList<Country> sortInformationByAscendingOrder() {
        ArrayList<Country> cloneCountry;
        cloneCountry = (ArrayList) list.clone();
        Comparator<Country> ct = new Comparator<>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        };
        cloneCountry.sort(ct);
        return cloneCountry;
    }

    public ArrayList<Country> getRecentlyEnteredInformation() {
        return list;
    }

    private boolean isExisted(Country country) {
        for (Country c : list) {
            if (c == country) {
                return true;
            }
        }
        return false;
    }
}
