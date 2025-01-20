/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ADMIN
 */
public class FruitManager {

    private final List<Fruit> listOfFruit;

    public FruitManager() {
        listOfFruit = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) throws Exception {
        if (isFruitExisted(fruit)) throw new Exception("Fruit is existed");
        listOfFruit.add(fruit);
    }

    public void update(Fruit fruit, int numberOfFruit) {
//        for (Fruit fr : listOfFruit) {
//            if (fr == fruit) {
//                fr.setQuantity(fr.getQuantity() - numberOfFruit);
//                return;
//            }
//        }
        // co the thay the doan code tren bang doan code duoi
        listOfFruit.stream()
                .filter(fr -> fr == fruit)
                .findFirst()
                .ifPresent(fr -> fr.setQuantity(fr.getQuantity() - numberOfFruit));
    }

    private boolean isFruitExisted(Fruit fruit) {
//        for (Fruit f : listOfFruit) {
//            if (f.equals(fruit)) {
//                return true;
//            }
//        }
//        return false;
        // co the thay the doan code tren bang doan code duoi
        return listOfFruit.stream().anyMatch(f -> f.equals(fruit));
    }

    private void sortListOfFruitById() {
        listOfFruit.sort(new Comparator<>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getFruitID().compareTo(o2.getFruitID());
            }
        });
    }

    public List<Fruit> getListOfFruit() {
        sortListOfFruitById();
        return new ArrayList<>(listOfFruit); // tra ve ban sao du lieu
    }

    public Fruit getFruit(String item) {
//        for (Fruit fruit : listOfFruit) {
//            if (fruit.getFruitID().equalsIgnoreCase(item)) {
//                return fruit;
//            }
//        }
//        return null;
        // co the thay the doan code tren bang doan code duoi
        return listOfFruit.stream().filter(fruit -> fruit.getFruitID().equalsIgnoreCase(item)).findFirst().orElse(null);
    }
}
