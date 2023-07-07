package sem4;
/*Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
3. Если введено print-num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        listLink();
    }

    public static void listLink(){
        List<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введи команду! ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text){
                case "print":
                    System.out.println(linked.remove(num));
                    break;
                case "exit":
                    System.out.println("До встречи!");
                    work = false;
                    break;
                default:
                    linked.add(num, text);
            }
        }
    }
}