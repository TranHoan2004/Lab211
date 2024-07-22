/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Fruit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class FruitManager {

    private final ArrayList<Fruit> listOfFruit;
    private Fruit fruit;

    public FruitManager() {
        listOfFruit = new ArrayList<>();
        this.fruit = new Fruit();
    }

    public void addFruit(Fruit fruit) throws Exception {
        if (isFruitExisted(fruit)) {
            throw new Exception("Fruit is existed");
        }
        listOfFruit.add(fruit);
    }

    public boolean update(Fruit fruit, int numberOfFruit) {
        for (Fruit fr : listOfFruit) {
            if (fr == fruit) {
                fr.setQuantity(fr.getQuantity() - numberOfFruit);
                return true;
            }
        }
        return false;
    }

    private boolean isFruitExisted(Fruit fruit) {
        for (Fruit f : listOfFruit) {
            if (f == fruit) {
                return true;
            }
        }
        return false;
    }

    private void sortListOfFruitById() {
        Collections.sort(listOfFruit, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getFruitID().compareTo(o2.getFruitID());
            }
        });
    }

    public ArrayList<Fruit> getListOfFruit() {
        sortListOfFruitById();
        return listOfFruit;
    }

    public Fruit getFruit(String item) {
        for (Fruit fruit : listOfFruit) {
            if (fruit.getFruitID().equalsIgnoreCase(item)) {
                return fruit;
            }
        }
        return null;
    }
}
