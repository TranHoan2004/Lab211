/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.Validation;
import entity.Fruit;
import entity.Order;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author ADMIN
 */
public class Manager {

//    private static ArrayList<Fruit> f = new ArrayList<>();
    private final ArrayList<Fruit> listOfFruit;
    private final ArrayList<Order> listOfOrder;
    private final Hashtable<String, ArrayList<Order>> list;
    private Fruit fruit;

    public Manager() {
        listOfFruit = new ArrayList<>();
        listOfOrder = new ArrayList<>();
        list = new Hashtable<>();
        this.fruit = new Fruit();
    }

    public ArrayList<Fruit> getListOfFruit() {
        return listOfFruit;
    }

    public Hashtable<String, ArrayList<Order>> getCart() {
        return list;
    }

    public ArrayList<Order> getOrder() {
        return listOfOrder;
    }

    public void createFruit(Fruit fr) throws Exception {
        if (checkExistedFruit(fr.getFruitID(), fr.getFruitName())) {
            throw new Exception("ID is existed, cannot be create");
        }
        listOfFruit.add(fr);
    }

    public void order(int numberOfFruit, int item, String name) throws Exception {
        fruit = getFruitByItem(item);
        double amount = fruit.getPrice() * numberOfFruit;
        if (list.containsKey(name)) {
            
        } else {
            ArrayList<Order> newList = new ArrayList<>();
        }
        if (checkExistedOrder()) {
            listOfOrder.add(new Order(fruit, numberOfFruit, amount));
            updateQuantity(numberOfFruit);
        }
    }

    public void addToList(String name) {
        list.put(name, listOfOrder);
    }

    private Fruit getFruitByItem(int item) throws Exception {
        for (Fruit fruit : listOfFruit) {
            if (listOfFruit.indexOf(fruit) == item) {
                return fruit;
            }
        }
        throw new Exception("THere is no fruit that has this item");
    }

    public void displayListFruit(ArrayList<Fruit> fruit) {

    }

    private boolean checkExistedOrder() {
        for (Order order : listOfOrder) {
            if (order.getFruit().getFruitID().equalsIgnoreCase(fruit.getFruitID())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkExistedFruit(String id, String name) {
        for (Fruit fruit : listOfFruit) {
            if (fruit.getFruitID().equalsIgnoreCase(id)
                    || fruit.getFruitName().equalsIgnoreCase(name)
                    || (fruit.getFruitID().equalsIgnoreCase(id) && fruit.getFruitName().equalsIgnoreCase(name))) {
                return true;
            }
        }
        return false;
    }

    private void updateQuantity(int numberOfFruit) {
        fruit.setQuantity(fruit.getQuantity() - numberOfFruit);
    }
//    public static void viewOrders(Hashtable<String, ArrayList<Order>> fruit) {
//        if (fruit.isEmpty()) {
//            System.out.println("There is no item");
//        }
//        for (String name: fruit.keySet()) {
//            System.out.println("Customer: "+name);
//            ArrayList<Order> fruit = fruit.get(name);
//            displayListOrder(fruit);
//        }
//    }

//    public static void shopping(ArrayList<Fruit> fruit, Hashtable<String, ArrayList<Order>> hashTable) {
//
//        ArrayList<Order> listOrder = new ArrayList<>();
//        while (true) {
//            displayListFruit(f);
//            int choice=Validation.getInt("Enter item: ", "Please enter a number in range of number of items", 1, f.size());
//            //lay thong tin fruit duoc chon
//            Fruit fr = getFruitByItem(choice, f);
//            int quantity=Validation.getInt("Enter quantity: ", "Please enter an integer number"); //nhap so luong fruit muon mua
//            //cap nhat lai quantity cua fr
//            fr.setQuantity(fr.getQuantity()-quantity);
//            System.out.println("You selected: "+fr.getFruitName());
//            //kiem tra trong fruit id cua item da ton tai hay chua
//            if (Validation.checkItemExistOrder(listOrder, fr.getFruitID())) {
//                updateOrder(listOrder, fr.getFruitID(), quantity);
//            }
//            else { //neu chua ton tai item trong fruit
//                listOrder.add(new Order(fr.getFruitID(), fr.getFruitName(), quantity, fr.getPrice()));
//            }
//            if (!Validation.checkYN("Do you want to continue (Y/N)? ", "Please enter Y or N")) break;
//        }
//        displayListOrder(listOrder);
//        String name = Validation.getStringByRegex("Input your name: ", "Not empty");
//        hashTable.put(name, listOrder);
//        System.out.println("Add successfully");
//    }
//    public static void updateOrder(ArrayList<Order> listOrder, String id, int quantity) {
//        for (Order fruit: listOrder) {
//            if (fruit.getFruitID().equalsIgnoreCase(id)) //kiem tra ID cua fruit co trung voi id cua Order khong
//            {
//                fruit.setQuantity(fruit.getQuantity()+quantity);
//                return;
//            }
//        }
//    }
//    public static Fruit getFruitByItem(int choice, ArrayList<Fruit> listFruit) {
//        int count=0;
//        for (Fruit obj: listFruit) {
//            if (obj.getQuantity() != 0) {
//                count++;
//            }   
//            if (count==choice) {
//                return obj;
//            }
//        }            
//        return null;
//    }
//    public static void displayListFruit(ArrayList<Fruit> fruit) {
//        
//        System.out.println("============================");
//        System.out.println("LIST OF FRUIT");
//        System.out.printf("|++%s++|++%s++|++%s++|++%s++|\n", "Item",
//                "Fruit Name", "Origin", "Price");
//        for (Fruit fr: fruit) {
//            if (fr.getQuantity() != 0) {
//                System.out.printf("%-13s%-12s%-12s%.0f$\n", fr.getFruitID(),
//                        fr.getFruitName(), fr.getOrigin(), fr.getPrice());
//            }
//        }
//    }
//    public static void displayListOrder(ArrayList<Order> orderList) {
//        double total=0;
//        System.out.println("ORDER LIST");
//        System.out.printf("|++%s++|++%s++|++%s++|++%s++|\n","Product","Quantity","Price","Amount");
//        for (Order obj: orderList) {            
//            System.out.printf("%-16s%-12d%-11.0f$%.0f$",obj.getFruitName()
//                    ,obj.getQuantity(),obj.getPrice()
//                    ,(obj.getQuantity()*obj.getPrice()));
//            total+=(obj.getQuantity()*obj.getPrice());            
//        }
//        System.out.println("");
//        System.out.printf("Total: %.0f$\n", total);
//    }
}
