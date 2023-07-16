package sem5hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> map = new HashMap<>();
    Map<String, List<String>> linkmap = new LinkedHashMap<>();

    public void add(String Name, String Phone){
        if (map.containsKey(Name)) {
            List<String> list = map.get(Name);
            list.add(Phone);

        }else{
            List<String>list = new ArrayList<>();
            list.add(Phone);
            map.put(Name, list);
        }
        
    }

    String getAll(){
        return map.toString();
    }

    String getSort(){
        int count = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = entry.getValue().toString();
            String[] arr = str.split(" ");
            if (arr.length > count) {
                count = arr.length;
            }
        }
        for (int i = 0; i < map.size(); i++) {
            for (Map.Entry entry : map.entrySet()) {
                String str = entry.getValue().toString();
                str = str.replace("[", "");
                str = str.replace("]", "");
                str = str.replace(",", "");
                String[] arr = str.split(" ");
                if (arr.length == count) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < arr.length; j++) {
                        list.add(arr[j]);
                    }
                    linkmap.put(entry.getKey().toString(), list);
                }
            }
            count--;
        }
        return linkmap.toString();
    }
}