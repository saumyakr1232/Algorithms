import java.util.Arrays;

public class MergeSort {
    private int[] theArray;
    private int arrSize;
    
    MergeSort(int size){
        this.arrSize = size;
        this.theArray = new int[size];
    }

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort(10000);
        mergeSort.generateRandomArray();

        double startTime, endTime;

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(mergeSort.theArray);
        endTime = System.currentTimeMillis();

        System.out.println("Merge sort took " + (endTime - startTime));

        
    }

    public void generateRandomArray(){
        for (int i = 0; i< arrSize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;

        }

    }

    public int[] mergeSort(int array[]){

        if (array.length <= 1){
            return array;
        }

        int middleIndex = array.length/2;
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        int[] leftSorted = mergeSort(leftArray);
        int[] rightSroted = mergeSort(rightArray);

        return Merge(leftSorted, rightSroted);


    }

    public int[] Merge(int[] left, int[] right){

        int ptr_one = 0;
        int ptr_two = 0;
        int ptr_merged = 0;

        int merged[] = new int[left.length + right.length];

        while(ptr_one < left.length && ptr_two < left.length){
            if (left[ptr_one] <= right[ptr_two]){
                merged[ptr_merged] = left[ptr_one];
                ptr_one++;
            }
            else {
                merged[ptr_merged] = right[ptr_two];
                ptr_two++;
            }
            ptr_merged++;
        }
        // remaining of first array
        while(ptr_one < left.length){
            merged[ptr_merged] = left[ptr_one];
            ptr_one++;
            ptr_merged++;
        }

        // remaining of second array
        while(ptr_one < left.length){
            merged[ptr_merged] = left[ptr_one];
            ptr_one++;
            ptr_merged++;
        }


        return merged;


    }
    
}
