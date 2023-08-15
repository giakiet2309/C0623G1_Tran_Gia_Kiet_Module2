
package ss11_DSA_Stack_Queue.exercise.reverse_item;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseItemTest {
    public static void main(String[] args) {

        String[] string1 = "3518935190".split("");
        String[] string2 = "auhcmocname".split("");

        List<String> arr1 = new ArrayList<>();
        Stack<String> arr2 = new Stack<>();
        System.out.println("Mảng ban đầu ");
        for (int i = 0; i < string1.length; i++) {
            arr1.add(string1[i]);
        }
        System.out.println(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            arr2.add(arr1.get(i));
        }
        int size = arr2.size();
        for (int i = 0; i < size; i++) {
            arr1.set(i, arr2.pop());
        }
        System.out.println("Mảng sau khi đảo ngược");
        System.out.println(arr1);
        System.out.println("");

        List<String> arrString1 = new ArrayList<>();
        Stack<String> arrString2 = new Stack<>();
        System.out.println("Mảng ban đầu ");
        for (int i = 0; i < string2.length; i++) {
            arrString1.add(string2[i]);
        }
        System.out.println(arrString1);
        for (int i = 0; i < arrString1.size(); i++) {
            arrString2.add(arrString1.get(i));
        }
        int sizeString = arrString2.size();
        for (int i = 0; i < sizeString; i++) {
            arrString1.set(i, arrString2.pop());
        }
        System.out.println("Mảng sau khi đảo ngược");
        System.out.println(arrString1);
    }
}


