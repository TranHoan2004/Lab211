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
    private ArrayList<Fruit> list = new ArrayList<>();
    private ArrayList<Order> listOfOrder = new ArrayList<>();

    public ArrayList<Fruit> getListOfFruit() {
        return list;
    }

    public void createFruit(Fruit fr) throws Exception {
        if (checkItemExistFruit(fr.getFruitID(), fr.getFruitName())) {
            throw new Exception("ID is existed, cannot be create");
        }
        list.add(fr);
    }

    public void viewOrders(Hashtable<String, ArrayList<Order>> order) {

    }

    public void Shopping(ArrayList<Fruit> fruit, Hashtable<String, ArrayList<Order>> hashTable) {

    }

    public void updateOrder(ArrayList<Order> listOrder, String id, int quantity) {

    }

    public Fruit getFruitByItem(int choice, ArrayList<Fruit> listFruit) {
        Fruit fr = new Fruit();
        return fr;
    }

    public void displayListFruit(ArrayList<Fruit> fruit) {

    }

    public void displayListOrder(ArrayList<Order> orderList) {

    }

    private boolean checkItemExistOrder(String id) {
        for (Order order : listOfOrder) {
            if (order.getFruitID().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkItemExistFruit(String id, String name) {
        for (Fruit order : list) {
            if (order.getFruitID().equalsIgnoreCase(id)
                    || order.getFruitName().equalsIgnoreCase(name)
                    || (order.getFruitID().equalsIgnoreCase(id) && order.getFruitName().equalsIgnoreCase(name))) {
                return true;
            }
        }
        return false;
    }
//    public static void createFruit() {
//        String fruitID;
//        String fruitName;
//        double price;
//        int quantity;
//        String origin;
//        fruitID=Validation.getStringByRegex("Enter Fruits ID: ", "Not empty");
//        fruitName=Validation.getStringByRegex("Enter Fruits Name: ", "Not empty");
//        price=Validation.getDouble("Enter Fruits Price: ", "Please enter an integer number");
//        quantity=Validation.getInt("Enter Fruits Quantities: ", "Please enter a number");
//        origin=Validation.getStringByRegex("Enter Fruits Origin: ", "Not empty");
//        if (Validation.checkItemExistFruit(f, fruitID, fruitName)) {
//            System.out.println("ID is existed");
//        }
//        else f.add(new Fruit(fruitID, fruitName, price, quantity, origin));
//        displayListFruit(f);
//    }
//    public static void viewOrders(Hashtable<String, ArrayList<Order>> order) {
//        if (order.isEmpty()) {
//            System.out.println("There is no item");
//        }
//        for (String name: order.keySet()) {
//            System.out.println("Customer: "+name);
//            ArrayList<Order> fruit = order.get(name);
//            displayListOrder(fruit);
//        }
//    }

//    public static void Shopping(ArrayList<Fruit> fruit, Hashtable<String, ArrayList<Order>> hashTable) {
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
//            //kiem tra trong order id cua item da ton tai hay chua
//            if (Validation.checkItemExistOrder(listOrder, fr.getFruitID())) {
//                updateOrder(listOrder, fr.getFruitID(), quantity);
//            }
//            else { //neu chua ton tai item trong order
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
//        for (Order order: listOrder) {
//            if (order.getFruitID().equalsIgnoreCase(id)) //kiem tra ID cua fruit co trung voi id cua Order khong
//            {
//                order.setQuantity(order.getQuantity()+quantity);
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
