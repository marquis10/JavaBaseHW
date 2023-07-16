package sem5.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        System.out.println(task3("{a}[+]{(d*3}"));
    }

//  Для одного вида скобок

//     static boolean task3(String str){
//         Stack<Character> stack = new Stack<>();
//         char[] c = str.toCharArray();
//         for (int i = 0; i < c.length; i++) {
//             if (c[i] == '(') stack.push(c[i]);
//             if (c[i] == ')') {
//                 if (stack.isEmpty() || stack.pop() != '(') return false;
//             }
//         }
//         if(!stack.isEmpty()) return false;
//         return true;
//     }
// }

//  Для множества скобок

    static boolean task3(String str){
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('<', '>');
        map.put('[', ']');
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) stack.push(c[i]);
            if (map.containsValue(c[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}