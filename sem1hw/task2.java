// 2) Вывести все простые числа от 1 до 1000

package sem1hw;

public class task2 {
    public static void main(String[] args) {
        System.out.printf("Список простых чисел от 1 до 1000: ");
        for (int i = 2; i < 1001; i++) {
            int n = 1, count = 0;
            while (n < i + 1) {
                if (i % n == 0)
                    count += 1;
                n += 1;
            }
            if (count == 2)
                System.out.printf(" %d", i);
        }
    }
}