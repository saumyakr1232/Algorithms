public class Utils {

    public static int[] generateRandomArray(int arrSize){
        int [] theArray = new int[arrSize];
        for (int i = 0; i< arrSize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;

        }

        return theArray;

    }
    
}
