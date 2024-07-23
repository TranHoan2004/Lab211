/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private File file;
    private ArrayList<String> listOfFileName;

    public Manager() {
        this.listOfFileName = new ArrayList<>();
    }

    public void setFile(String path) {
        this.file = new File(path);
    }

    public int checkPath() {
        if (file.exists()) {
            if (file.isFile()) {
                return 1;
            }
            if (file.isDirectory()) {
                return 2;
            }
        }        
        return 0;
    }

    public ArrayList<String> getJavaFile() throws Exception {
        if (isFileOrDirectory()) {
            File[] listOfFile = file.listFiles();
            for (File listOfFile1 : listOfFile) {
                if (listOfFile1.isFile() && listOfFile1.getName().endsWith(".java")) {
                    listOfFileName.add(listOfFile1.getName());
                }
            }
            return listOfFileName;
        } else {
            throw new Exception("Path name invalid");
        }
    }

    public boolean isFileOrDirectory() {
        return (file.exists() && file.isDirectory());
    }
    
}
