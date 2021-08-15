package SortingAlgorithms;
import java.util.Arrays;

public class Utils {

    public static int[] generateRandomArray(int arrSize){
        int [] theArray = new int[arrSize];
        for (int i = 0; i< arrSize; i++){
            theArray[i] = (int) (Math.random() * 1000) + 10;

        }

        return theArray;

    }
    /**
     * Sieve of Erotosthenes
     * (All integers are assumed prime until proven composite)
     * @param n  Up to n;
     * @return Array of primes;
     */
    public static int[] primes(int n){
        
        boolean[] isPrime = new boolean[n+1];
        

        for (int i = 0; i<=n; i++){
            isPrime[i] = true;

        }

        for (int divisor = 2; divisor*divisor <= n; divisor++){

            if (isPrime[divisor]){
                for (int i = 2 * divisor; i<=n; i += divisor){
                    isPrime[i] = false;
                }
            }
        }
        
        int size = 0;

        for (int i=2; i<=n;i++){
            if (isPrime[i]){
                size++;
            }
        }

        int[] primes = new int[size];
        int k = 0;
        for (int i=2; i<=n; i++){
            if(isPrime[i]){
                primes[k] = i;
                k++;
            }
        }
        System.out.println(Arrays.toString(primes));
        return primes;

    }

    public static void main(String[] args) {
        primes(25);
    }
    
}
