package SortingAlgorithms;


/**
 * Time complexity : O(n^2)
 * 
 * 
 * Space Complexity : O(1)
 * 
 * Very good for almost sorted arrays
 */

public class InsertionSort {
    private int[] theArray;


    public InsertionSort(int size){
        this.theArray = Utils.generateRandomArray(size);
    }
    
    public  void insertionSort(){
        

        int sortedIndex = 0;

        while (sortedIndex < theArray.length - 1){
            
            int inner_i = sortedIndex + 1;

            while (inner_i >= 1 && theArray[inner_i] < theArray[inner_i - 1]){
                swap(inner_i, inner_i - 1);
                inner_i --;
            }

            sortedIndex ++;
        }
    }

    public  void swap(int pos1, int pos2){
        int temp = theArray[pos1];
        theArray[pos1] = theArray[pos2];
        theArray[pos2] = temp;
        
    }

    public static void main(String[] args) {
        
        InsertionSort sort = new InsertionSort(10);
        System.out.print("Before sorting :");
        for (int i : sort.theArray){
            System.out.print(i + " ");
        }
        sort.insertionSort();
        System.out.print("\nafter sorting : " );
        
        for (int i : sort.theArray){
            System.out.print(i + " ");
        }
    }
}
