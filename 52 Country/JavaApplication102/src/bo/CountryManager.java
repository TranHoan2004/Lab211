/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Country;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ADMIN
 */
public class CountryManager {
    private final List<Country> list;

    public CountryManager() {
        this.list = new ArrayList<>();
    }

    public void addToList(Country country) throws Exception {
        if (isExisted(country)) throw new Exception("This country is already existed");
        list.add(country);
    }

    public ArrayList<Country> searchInformationByName(String name) {
//        List<Country> listOfCountry = new ArrayList<>();
//        for (Country country : list) {
//            if (country.getCountryName().toUpperCase().contains(name.toUpperCase())
//                || country.getCountryName().toLowerCase().contains(name.toLowerCase())) {
//                listOfCountry.add(country);
//            }
//        }
//        return listOfCountry;
        // co the thay the doan code tren bang doan code duoi
        return list
                .stream()
                .filter(country -> country.getCountryName().toUpperCase().contains(name.toUpperCase())
                                   || country.getCountryName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Country> sortInformationByAscendingOrder() {
        List<Country> cloneCountry = new ArrayList<>(list);
//        Comparator<Country> ct = new Comparator<>() {
//            @Override
//            public int compare(Country o1, Country o2) {
//                return o1.getCountryName().compareTo(o2.getCountryName());
//            }
//        };
        // co the thay the bang doan code tren
        Comparator<Country> ct = (o1, o2) -> o1.getCountryName().compareTo(o2.getCountryName());
        cloneCountry.sort(ct);
        return cloneCountry;
    }

    public List<Country> getRecentlyEnteredInformation() {
        return new ArrayList<>(list);
    }

    private boolean isExisted(Country country) {
//        for (Country c : list) {
//            if (c == country) {
//                return true;
//            }
//        }
//        return false;
        // co the thay the doan code tren bang doan code duoi
        return list.stream().anyMatch(c -> c == country);
    }
}
