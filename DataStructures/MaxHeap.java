package DataStructures;
/* Time complexity

*/


public class MaxHeap {
    private int data[];
    private int maxSize;
    private int cSize;

    public MaxHeap(int size){
        this.maxSize = size;
        this.data = new int[maxSize+1];
        cSize = 0;

        for (int i=0; i< data.length; i++){
            data[i] = -1;
        }
    }
    public MaxHeap(){
        this.maxSize = 10;
        this.data = new int[maxSize];
        cSize = 0;

        for (int i=0; i< data.length; i++){
            data[i] = -1;
        }
    }

    public int length(){
        return this.cSize;
    }

    public boolean isEmpty(){
        return cSize == 0;
    }

    public void insert(int e){
        if (cSize == maxSize){
            System.out.println("Heap is full");
            return;
        }
        cSize += 1;
        int hi = cSize;
        //up heap Bubbling 
        while (hi > 1 && e > data[hi/2]){
            data[hi] = data[hi/2];
            hi = hi/2;

        }

        data[hi] = e;


    }

    public  int pop(){
        if (cSize == 0){
            System.out.println("Heap is empty");
            return -1;
        }
        if (cSize  == 1){
            int poped = data[1];
            data[cSize] = -1;
            cSize -= 1;
            return poped;

        }
        if (cSize == 2){
            int poped = data[1];
            data[1] = data[cSize];
            data[cSize] = -1;
            return poped;
        }

         int hi = 1;
         int popped = data[1];
         data[hi] = data[cSize];
         data[cSize] = -1;
        
         // down heap bubbling
         while(hi < cSize && data[hi] < data[hi]);
         
         return popped;

        

    }

    public void display(){
        int height = (int) (Math.log(cSize)/Math.log(2));
        int maxWidth = (int) Math.pow(2.0, (double) height);
        String tree = "";
        int k = 1;
        for (int i= 0; i<= height; i++){
            int width = (int) Math.pow(2.0, (double) i);
            int padding = (maxWidth - width + 1);
            String line = "XX";
            if (padding != 0){
                line = String.format("%" + padding + "s", "X")+ String.format("%-" + padding + "s", "X");
            }

            String nodes ="";
            for (int j=0; j< width; j++){
                nodes += data[k] + " ";
                k++;
                
            }
            tree += line.replaceAll("XX", nodes);
            tree += "\n";
        }

        // for (int i: data){
        //     System.out.print(i + " ");
        // }
        System.out.println(tree);

        
    }
    
}


