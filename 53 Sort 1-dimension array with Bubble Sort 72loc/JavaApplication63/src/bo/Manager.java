/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void addArray(int[] array1) {
        this.array = array1;
    }

    public void sortAscending() {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array.length - i - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }

    public void sortDescending() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int y = 0; y < array.length - i - 1; y++) {
                if (array[y] < array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }
}
