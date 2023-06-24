// 3) Реализовать простой калькулятор

package sem1hw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        String oper = iScanner.next();
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        int res = 0;
        switch (oper) {
            case "/":
                res = num1 / num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "+":
                res = num1 + num2;
                break;
        }
        System.out.printf("Ответ: %d", res);
    }
}
