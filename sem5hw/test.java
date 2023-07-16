package sem5hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        String[] temp = new String[] {"Александр Кузьмин", "3225493"};


        if (map.containsKey(temp[0])) {
            List<String> list = map.get(temp[0]);
            list.add(temp[1]);

        }else{
            List<String>list = new ArrayList<>();
            list.add(temp[1]);
            map.put(temp[0], list);
        }
        System.out.println(map);
    }
}