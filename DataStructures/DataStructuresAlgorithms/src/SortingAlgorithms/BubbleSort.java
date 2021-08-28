package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    int[] theArray;

    public BubbleSort(int size){
        theArray = Utils.generateRandomArray(size);

    }

    public void sort(){
        for (int i=0; i<theArray.length; i++){
            for (int j = 0; j<theArray.length - 1; j++){
                System.out.println(Arrays.toString(theArray));
                if (theArray[j] > theArray[j+ 1]){
                    swap(j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(theArray));

    }

    public  void swap(int pos1, int pos2){
        int temp = theArray[pos1];
        theArray[pos1] = theArray[pos2];
        theArray[pos2] = temp;
        
    }

    public static void  main(String...args){
        BubbleSort bs = new BubbleSort(10);

        System.out.println("Array before sort " + Arrays.toString(bs.theArray));
        bs.sort();
        
    }    
    
    
}
