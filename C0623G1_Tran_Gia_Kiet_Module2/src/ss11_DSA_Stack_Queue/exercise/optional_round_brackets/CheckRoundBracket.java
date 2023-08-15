package ss11_DSA_Stack_Queue.exercise.optional_round_brackets;


import java.util.HashMap;
import java.util.Map;

public class CheckRoundBracket {
    public static void checkRoundBracket(String expression) {
        Map<Character, Integer> list = new HashMap<>();
        list.put('(', 0);
        list.put(')', 0);
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') list.put('(', list.get('(') + 1);
            if (expression.charAt(i) == ')') list.put(')', list.get(')') + 1);
        }
        int check = list.get('(') - list.get(')');
        if (check == 0) {
            System.out.println("Đủ ngoặc ");
        } else if (check < 0) {
            System.out.println(" Thiếu " + (-check) + " dấu (");
        } else {
            System.out.println(" Thiếu " + check + " dấu )");
        }
    }
}
