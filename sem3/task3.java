package sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. 
//Пройти по списку, найти и удалить целые числа.
public class task3 {
    public static void main(String[] args) {
        t3();
    }

    static void t3(){
        List list = new ArrayList<>();
        list.add("List");
        list.add(77);
        list.add(55);
        list.add("Hello");
        list.add(12);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer || o instanceof String) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}