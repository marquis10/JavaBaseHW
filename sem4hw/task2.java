package sem4hw;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// Очередь это Queue, реализуется с помощью LinkedList’a. Первый зашёл, первый вышел.

import java.util.LinkedList;
import java.util.Queue;


public class task2 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        int num = 6;
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println("Начальная очередь: ");
        System.out.println(que);
        System.out.printf("Добавляем в очередь элемент: %d", num);
        System.out.println();
        System.out.println("Очередь: ");
        enqueue(que, num);
        System.out.println();
        System.out.println("1 элемент очереди: ");
        System.out.println(dequeue(que));
        System.out.println("Удалили 1 элемент очереди: ");
        System.out.println(que);
        System.out.println("Теперь первый элемент очереди: ");
        System.out.println(first(que));
        System.out.println(que);
    }

    static void enqueue(Queue<Integer> que, int num){
        int size = que.size();
        que.offer(num);
        System.out.print(que);
    }

    static int dequeue(Queue<Integer> que){
        return que.poll();
    }

    static int first(Queue<Integer> que){
        return que.peek();
    }
}