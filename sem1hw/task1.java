// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package sem1hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();
        iScanner.close();
        int sumNum = 0, sumFac = 1;
        for (int i = 1; i < N + 1; i++) {
            sumNum = sumNum + i;
            sumFac = sumFac * i;
        }
        System.out.printf("Число N = %d", N);
        System.out.printf("\nСумма чисел от 1 до N = %d", sumNum);
        System.out.printf("\nФакториал числа N = %d", sumFac);
    }
}