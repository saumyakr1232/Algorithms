package DataStructures;

public class DynamicArray {
    private int capacity = 16;
    private int size = 0;
    private int[] array = new int[capacity];


    public DynamicArray(int capacity){
        this.capacity = capacity;
    }

    public DynamicArray(){

    }

    public int size(){
        return this.size;
    }
    public int capacity(){
        return this.capacity;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

    public int at(int index){
        if (index < size){
            return array[index];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
    

    public void push(int item){
        if (size == capacity){
            resize(capacity*2);
            array[size] = item;
            size++;
        }else{
            array[size] = item;
            size++;
        }
    }

    public void insert(int index, int item){
        if (index > size){
            throw new IndexOutOfBoundsException();
        }else if (index == size){
            push(item);
        }else{
            if (size+1 >= capacity){
                resize(2 * capacity);
            }
            int temp = array[index]; 
            // shift item to right
            for (int i=index; i<size; i++){
                int temp2 = array[i];
                array[i+1] = temp;
                temp = temp2;
            }
            array[index] = item;
            size++;
            
        }
    }


    public void pop(){
        if (size == 0){
            throw new IndexOutOfBoundsException();
        }
        
        array[size-1] = 0;
        size--;
        if (size <= capacity/2){
            resize(capacity/2);
        }
    }

    public void delete(int index){
        if (index>= size){
            throw new IndexOutOfBoundsException();
        }else{
            if (index-1 <= capacity/2){
                resize(capacity/2);
            }
            for (int i=index; i<size-1 ; i++){
                array[i] = array[i+1];
            }
            array[size-1] = 0;
            size--;
        }
    }

    public int find(int item){
        for (int i=0; i<size; i++){
            if (array[i] == item){
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int item){
        int index = find(item);
        if (index != -1){
            delete(index);
            return true;
        }else{
            return false;
        }
    }

    private void resize(int capacity){
        this.capacity = capacity;
        int[] newArray = new int[capacity];

        int end = capacity < size ? capacity : size;

            for (int i=0; i<end; i++){
                newArray[i] = array[i];
            }
            this.array = newArray;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<size; i++){
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }


    
}
