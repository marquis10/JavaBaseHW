package sem4;
// Замерьте время, за которое в ArrayList добавятся 10_000 элементов
// Замерьте время, за которое в LinkedList добавятся 10_000 элементов

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class task0 {
    public static void main(String[] args) {
        zamer();
    }

    static void zamer(){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> linked = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linked.add(i);
        }
        long secondEnd = System.currentTimeMillis();
        System.out.println(end - start); // 20
        System.out.println(secondEnd - end); // 151
    }
}
