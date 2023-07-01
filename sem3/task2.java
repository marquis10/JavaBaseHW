package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
public class task2 {
    
    public static void main(String[] args) {
        zapoln(creatList(10, 0, 10));

}
    static List<Integer> creatList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void zapoln(List<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
}