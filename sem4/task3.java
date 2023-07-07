package sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*1. Написать метод, который принимает массив элементов, помещает их в стек
 * и выводит на консоль содержимое стека.
 * 2. Написать метод, который принимает массив элементов, помещает их в очередь
 * и выводит на консоль содержимое очереди
 */
public class task3 {
    public static void main(String[] args) {
        t3();
    }

    static void t3(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}