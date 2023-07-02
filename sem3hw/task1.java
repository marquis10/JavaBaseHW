package sem3hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(4,2,3,4,4,9,2,5,7,1,8,6,7));
        System.out.println(intList);
        delEven(intList);
        // minValue(intList);
        // maxValue(intList);
        // averageValue(intList);
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
        System.out.println(list);
    }


    public static void minValue(ArrayList<Integer> list) {
        
    }


    public static void maxValue(ArrayList<Integer> list) {
        
    }


    public static void averageValue(ArrayList<Integer> list) {
        
    }
}