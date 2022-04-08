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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] A = {3, 5, 1, 9, 4, 7, 2, 6};
        //int [] A = {3, 4, 1, 2};
        //QuickSort.qsort(A, 0, A.length-1);
        SimpleQuickSort.quickSort(A, 0, A.length-1);
        for (int a: A) {
            System.out.print(a + " ");
        }
    }
    
}
