package sem5.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*	Взять набор строк, например, 
Мороз и солнце день чудесный 
Ещё ты дремлешь друг прелестный 
Пора красавица проснись.
Написать метод, который отсортирует слова по длине с помощью TreeMap. 
Слова с одинаковой длиной не должны “потеряться”.
 */
public class task4 {
    public static void main(String[] args) {
        System.out.println(task4("Мороз и солнце день чудесный Ещё ты дремлешь друг прелестный Пора красавица проснись.")); 
    }

    static String task4(String strTask4){
        strTask4 = strTask4.replace("\n", " ");
        strTask4 = strTask4.replace(".", " ");
        String[] words = strTask4.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for (String string : words) {
            int len = string.length();
            if(map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(string);
            } else{
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(len, list);
            }
        }
    return map.toString();
    }
}