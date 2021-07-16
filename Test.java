import DataStructures.MaxHeap;

public class Test {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(15);
        heap.insert(7);
        heap.insert(6);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);
        heap.insert(12);
        heap.insert(11);
        heap.insert(9);
        heap.insert(10);
        System.out.println(heap.pop());
        
        heap.display();


    }
    
}
