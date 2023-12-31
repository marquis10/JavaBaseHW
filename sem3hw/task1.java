package sem3hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(4,2,3,4,4,9,2,5,7,1,8,6,7));
        System.out.printf("Стартовая коллекция: ");
        System.out.println(intList);
        delEven(intList);
        minValue(intList);
        maxValue(intList);
        averageValue(intList);
    }


    public static void delEven(ArrayList<Integer> list){
        int count = 1;
        List<Integer> tempList = new ArrayList<>(list);
        for (Integer integer : tempList) {
            if (integer % 2 == 0) {
                count--;
                list.remove(count);
            }
            count++;
        }
        System.out.printf("Коллекция без чётных чисел: ");
        System.out.print(list);
    }


    public static void minValue(ArrayList<Integer> list) {
        int value = list.get(0);
        for (Integer integer : list) {
            if (integer < value) {
                value = integer;
            }
        }
        System.out.println();
        System.out.printf("Наименьшее число коллекции: %d", value);
    }


    public static void maxValue(ArrayList<Integer> list) {
        int value = list.get(0);
        for (Integer integer : list) {
            if (integer > value) {
                value = integer;
            }
        }
        System.out.println();
        System.out.printf("Наибольшее число коллекции: %d", value);
    }


    public static void averageValue(ArrayList<Integer> list) {
        int value = 0, count = 0;
        for (Integer integer : list) {
            value =  value + integer;
        }
        System.out.println();
        System.out.printf("Количество элементов коллекции: %d", list.size());
        System.out.println();
        System.out.printf("Сумма всех чисел коллекции: %d", value);
        value = value / list.size();
        System.out.println();
        System.out.printf("Средне-арифметическое коллекции: %d", value);
    }
}