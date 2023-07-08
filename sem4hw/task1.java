package sem4hw;
//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернёт “перевёрнутый” список.
import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(linked);
        reverse(linked);        
    }

    static void reverse(LinkedList<Integer> linked){
        // LinkedList<Integer> temp = new LinkedList<>();
        // int count = linked.size() - 1;
        // for (int i = 0; i < linked.size(); i++) {
        //     temp.add(i, linked.get(count));
        //     count--;
        // }
        // linked = temp;
        for (int i = 0, j = linked.size() - 1; i < j; i++) {
            linked.add(i, linked.remove(j));
        }
        System.out.println(linked);
    }
}