import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i< n; i ++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i=0; i<n ; i+= 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
