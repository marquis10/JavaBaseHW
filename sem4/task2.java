package sem4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*Реализовать консольное приложение которое:
 * 1. Принимает от пользователя и "запоминает" строки.
 * 2. Если введено print, выводить строки так, чтобы последняя введённая
 *  была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введённую строку из памяти.
 */
public class task2 {
    public static void main(String[] args) {
        t2();
    }

    public static void t2(){
        LinkedList<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите строку: ");
            String text = scanner.nextLine();
            switch (text) {
                case "print":
                    ListIterator listIterator = linked.listIterator(linked.size());
                    while (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                    System.out.println();
                    break;
                case "exit":
                    work = false;
                    break;
                case "revert":
                    linked.removeLast();
                    break;
                default:
                    linked.add(text);
            }
        }
    }
}
