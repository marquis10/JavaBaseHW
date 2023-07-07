package sem4;

public class MyStack {
    // Поля класса
    private Integer[] arr = new Integer[10];
    
    private int size = 0;
    
    // Методы класса
    int size(){
        return size;
    }
    
    boolean empty(){
        return size==0;
    }
    
    void push(int item){
        if(size == arr.length){
            Integer[] arr2 = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    int peek(){
        return arr[size - 1];
    }

    int pop(){
        return arr[--size];
    }
}