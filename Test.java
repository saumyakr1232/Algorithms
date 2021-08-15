import DataStructures.DynamicArray;

public class Test {
    public static void main(String[] args) {
        

      DynamicArray array = new DynamicArray();

      array.push(12);
      array.push(11);
      array.push(10);
      array.push(8);
      System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );
      array.insert(3, 9);
      System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );
    
      array.delete(1);
      System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );

    array.push(122);
    System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );
        array.pop();
      System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );
        array.push(1222);

        System.out.printf("Array %s , size %s, capacity %s \n", array.toString(), array.size(), array.capacity() );

    }
    
}
