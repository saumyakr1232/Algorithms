/**
 * Time Complexity : O(n^2)
 * 
 * Space Complexity : O(n)
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2,22,4,43,6,9,8,7};

        // System.out.println(selectionSort(arr));

        for (int i: selectionSort(arr)){
            System.out.print(i + " ");
        }
    }

    public static int[] selectionSort(int[] arr){

        int wall = -1;

        while(wall < arr.length - 1){

        int min_index = 0;
        int min = Integer.MAX_VALUE;
        for (int i= wall + 1; i< arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
                min_index = i;
            }
        }
    

        arr = swap(++wall, min_index, arr);


    }

    return arr;



    }

    public static int[] swap(int pos1, int pos2, int[] arr){

        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;
    }
    
}
