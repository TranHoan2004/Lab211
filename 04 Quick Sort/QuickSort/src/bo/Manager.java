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

    public int[] quickSort(int[] table, int first, int last) {
        int pivot;
        if (first < last) {
            pivot = partition(table, first, last);
            quickSort(table, first, pivot - 1);
            quickSort(table, pivot + 1, last);
        }
        return copyArray(table);
    }

    private int partition(int[] table, int first, int last) {
        int pivot, pivotval;
        pivotval = table[first];   //Chon nut dau lam chot (pivot)
        int i = first;
        int j = last;
        while (i < j) {//Bat dau quet
            while (table[i] <= pivotval && i < last) {
                i++; //a[i]>pivotval
            }  //Tu TRAI sang, gap phan tu dau tien >= chot thi dung
            while (table[j] > pivotval) {
                j--;         //a[j]<=pivotval
            } //Tu PHAI sang, gap phan tu dau tien < chot thi dung
            if (i < j) {
                //Doi cho cap nut sai vi tri
                int temp = table[i];
                table[i] = table[j];
                table[j] = temp;
            }
        } // Cho den khi i>=j thi dung. Khi do j chinh la vi tri moi cua chot 
        // Doi cho can duoi cho phan tu o vi tri chot. Tuc la dua chot ve vi tri cua no
        int temp = table[first];
        table[first] = table[j];
        table[j] = temp;
        pivot = j;  // Giu vi tri cua chot vao bien pivot
        return (pivot);  // Tra ve vi tri phan tu chot
    }

    private int[] copyArray(int[] firstArray) {
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        return secondArray;
    }
}
