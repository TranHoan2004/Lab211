/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Expense;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ADMIN
 */
public class FileManager {
    private final File file;

    public FileManager() {
        this.file = new File("Data.txt");
    }

    public void createText(String information) throws Exception {
//        file.getAbsolutePath();
        try {
            boolean isEmpty = !file.exists() || isFileEmpty();
            FileWriter fw = new FileWriter("Data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (isEmpty) {
                bw.write("\n======================= Expenses =======================\n");
                String string = String.format("%-12s%-15s%-15s%s\n", "ID", "Date", "Amount", "Content");
                bw.write(string);
            }
            bw.write(information);
            bw.write("\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new Exception("File is not existed");
        }
    }

    public int getMaxID() throws Exception {
//        file.getAbsolutePath();
        int lastId = 0;
        String filePath = "Data.txt";
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.trim().isEmpty() && Character.isDigit(line.trim().charAt(0))) {
                    String[] parts = line.split("\\s+");
                    int id = Integer.parseInt(parts[0]);
                    if (id > lastId) {
                        lastId = id;
                    }
                }
            }
        } catch (IOException e) {
            throw new Exception("File is not existed");
        }
        return lastId;
    }

    public boolean isFileEmpty() throws Exception {
        if (file.length() == 0) {
            return true;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void clear() throws Exception {
        FileWriter fw = new FileWriter(file);
        fw.write("");
        fw.close();
    }

    public ArrayList<Expense> readFromFile() throws Exception {
        ArrayList<Expense> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty() && Character.isDigit(line.trim().charAt(0))) {
                String[] parts = line.split("\\s+");
                int id = Integer.parseInt(parts[0]);
                String date = parts[1];
                double amount = Double.parseDouble(parts[2].replace(",", "."));
                StringBuilder content = new StringBuilder();
                for (int i = 3; i < parts.length; i++) {
                    content.append(parts[i]).append(" ");
                }
                Expense expense = new Expense();
                expense.setId(id);
                expense.setContent(content.toString());
                expense.setDate(date);
                expense.setMoney(amount);
                list.add(expense);
            }
        }
        return list;
    }
}
