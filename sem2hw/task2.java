package sem2hw;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[] {9, 5, 2, 4, 1, 7, 6};
        int temp = 0;
        String str = " ";
        String fileArr = "sem2hwtask2log.txt";
        File file = new File(fileArr);
        try {
            FileWriter writer = new FileWriter(file, false);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < (array.length) - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        str = Arrays.toString(array);
                        System.out.println(str);
                        writer.write(str);
                        writer.write('\n');
                    }
                }
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}