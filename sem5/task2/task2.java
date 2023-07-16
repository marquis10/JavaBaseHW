package sem5.task2;

import java.util.HashMap;
import java.util.Map;

/* Даны 2 строки, написать метод, который вернёт true, если эти строки являются изоморфными и false, если нет. 
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом:
Повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны).
Буква может не меняться, а остаться такой же. (Например, note - code).
Пример 1:
Input: s = “foo”, t = “bar”
f = b
o = a
o = r, а должно быть “a”
Output: false

Пример 2:
Input: s = “paper”, t = “title”
p = t
a = i
p = t
e = l
r = e
Output: true
 */
public class task2 {
    public static void main(String[] args) {
        System.out.println(task2("paper", "title")); 
    }

    static boolean task2(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
}