package ss11_DSA_Stack_Queue.exercise.keyword_frequency;

import java.util.HashMap;
import java.util.Map;

public class Keyword {
    private String str;

    public Keyword(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void countWord() {
        int value = 0;
        str = str.toUpperCase();
        Map<String, Integer> listKey = new HashMap<>();
        String[] lst = str.split(" ");
        for (int i = 0; i < lst.length; i++) {
            if (!listKey.containsKey(lst[i])) {
                listKey.put(lst[i], 1);
            } else {
                listKey.put(lst[i], listKey.get(lst[i]) + 1);
            }
        }
        for (String key : listKey.keySet()) {
            value = listKey.get(key);
            System.out.println("Ký tự : " + key + " Xuất hiện " + value + " lần");
        }
    }
}
