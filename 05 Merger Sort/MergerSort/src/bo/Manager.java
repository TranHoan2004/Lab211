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

    //non-recursion mergerSort
    public int[] mergerSort(int[] a) {
        int up1, low2, up2;
        int size = 1;
        int[] b = new int[a.length];
        while (size < a.length) {
            int low1 = 0;
            int i, j, k = 0;
            while (low1 + size < a.length) {
                low2 = low1 + size;
                up1 = low2 - 1;
                up2 = (low2 + size - 1 < a.length) ? low2 + size - 1 : a.length - 1;
                for (i = low1, j = low2; i <= up1 && j <= up2; k++) {
                    if (a[i] <= a[j]) {
                        b[k] = a[i++];
                    } else {
                        b[k] = a[j++];
                    }
                }
                for (; i <= up1; k++) {
                    b[k] = a[i++];
                }
                for (; j <= up2; k++) {
                    b[k] = a[j++];
                }
                low1 = up2 + 1;
            }
            for (i = low1; k < a.length; i++) {
                b[k++] = a[i];
            }
            for (i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
            size *= 2;
        }
        return b;
    }

    //recursion mergerSort
//    public void mergerSort(int[] a, int p, int r) {
//        if (p >= r) {
//            return;
//        }
//        int q = (p + r) / 2;
//        mergerSort(a, p, q);
//        mergerSort(a, q + 1, r);
//        merger(a, p, q, r);
//    }
//
//    public void merger(int[] a, int p, int q, int r) {
//        if (!(p <= q) && (q <= r)) {
//            return;
//        }
//        int n, i, j, k;
//        n = r - p + 1;
//        int[] b = new int[n];
//        i = p;
//        j = q + 1;
//        k = 0;
//        while (i <= q && j <= r) {
//            if (a[i] < a[j]) {
//                b[k++] = a[i++];
//            } else {
//                b[k++] = a[j++];
//            }
//        }
//        while (i <= q) {
//            b[k++] = a[i++];
//        }
//        while (j <= r) {
//            b[k++] = a[j++];
//        }
//        k = 0;
//        for (i = p; i <= r; i++) {
//            a[i] = b[k++];
//        }
//    }
}
