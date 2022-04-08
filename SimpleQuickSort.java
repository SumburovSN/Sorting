/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Sergey
 */
public class SimpleQuickSort {
    // Quicksort       
    public static void quickSort(int[] A, int p, int r) {
        output(A);
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q-1); // Sort left partition
            quickSort(A, q+1, r); // Sort right partition
        }
    }
        
    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        System.out.println("x=" + x);
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            System.out.println("partition " + j);
            output(A);
            if (A[j] <= x) {
                i++;
                System.out.println("j=" + j + " i=" + i);
                exchange(A, i, j);
            }            
        }
        exchange(A, i+1, r);
        
        return i+1; // Return first position in right partition
    }
    
    public static void exchange(int[] A, int i, int j) {
        if (i != j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        
    }
    
    public static void output(int[] A) {
        for (int a: A) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
    
}
