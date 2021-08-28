package SortingAlgorithms;

import java.nio.channels.Selector;
import java.util.Arrays;

/**
 * Time Complexity : O(n^2)
 * 
 * Space Complexity : O(n)
 */

public class SelectionSort {
    private int[] theArray;
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort(10);
        System.out.println("Before sorting " + Arrays.toString(ss.theArray));
        ss.sort();
        System.out.println("After sorting " + Arrays.toString(ss.theArray));

    }

    public SelectionSort(int size){
        theArray = Utils.generateRandomArray(size);
    }

    public void sort(){
        int wall = -1;

        while (wall < theArray.length - 1){
            int min_i = 0;
            int min = Integer.MAX_VALUE;
            
            for (int i= wall + 1; i<theArray.length; i++){
                if (theArray[i] < min){
                    min = theArray[i];
                    min_i = i;
                }
            }

            swap(min_i, ++wall);
        }
    }

    public  void swap(int pos1, int pos2){
        int temp = theArray[pos1];
        theArray[pos1] = theArray[pos2];
        theArray[pos2] = temp;
     
    }



}
