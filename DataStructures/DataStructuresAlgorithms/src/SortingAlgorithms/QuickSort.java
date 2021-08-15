package SortingAlgorithms;
/*
Time Complexity {
    Best : "O(n log(n))"
    Avg : "O(n log(n))"
    Worst : "O(n^2)"

}

Space Complixity {
    O(log(n))
}


*/

public class QuickSort{
    private int []theArray;
    private int arrSize;

    

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort(1000000);

        double startTime = System.currentTimeMillis();

        quickSort.quickSort(0, quickSort.arrSize -1);

        double endTime = System.currentTimeMillis();

        System.out.println("Time taken by quick sort in " + (endTime - startTime));
        
        
    }

    QuickSort(int size){
        this.theArray = new int[size];
        this.arrSize = size;
    }

    public void generateRandomArray(){
        for (int i = 0; i< arrSize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;

        }

    }

    public void quickSort(int left, int right){
        if (right - left <= 0){
            return;
        }
        else{
            int pivot = theArray[right];
            int pivotLocation = partitionArray(left, right, pivot);
            quickSort(left, pivotLocation -1);
            quickSort(pivotLocation+1, right);
        }

    
    }
    public void swapValues(int i, int j){
        int temp = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = temp;
    }

    public int partitionArray(int left, int right, int pivot){

        int leftPointer = left -1 ;
        int rightPointer  = right;

        while (true){
            while(theArray[++leftPointer] < pivot);
            while(theArray[--rightPointer] > pivot);
            
            if (leftPointer >= rightPointer){
                break;
            }else{
                swapValues(leftPointer, rightPointer);

            }
        }
        
        // move pivot
        swapValues(leftPointer, right);

        return leftPointer;

        
    }
}