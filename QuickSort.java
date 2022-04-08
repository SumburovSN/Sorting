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
public class QuickSort {
    
    // Quicksort       
    public static void qsort(int[] A, int i, int j) {
        output(A);
        int pivotindex = findpivot(i, j); // Pick a pivot
        System.out.println(A[pivotindex]);
        swap(A, pivotindex, j); // Stick pivot at end
        // k will be the first position in the right subarray
        int k = partition(A, i-1, j, A[j]);
        swap(A, k, j); // Put pivot in place
        if ((k-i) > 1) qsort(A, i, k-1); // Sort left partition
        if ((j-k) > 1) qsort(A, k+1, j); // Sort right partition
    }
    public static int findpivot(int i, int j) { return (i+j)/2; }
    
    public static int partition(int[] A, int l, int r, int pivot) {
        // Move bounds inward until they meet
        do {
            while (A[++l] < pivot);
            while ((r!=0) && (A[--r] > pivot));
            swap(A, l, r); // Swap out-of-place values
        } while (l < r); // Stop when they cross
        swap(A, l, r); // Reverse last, wasted swap
        return l; // Return first position in right partition
    }
    
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public static void output(int[] A) {
        for (int a: A) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
    
}
