package ss13_searching_method.exercise.ascending_string;

import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn vào đây");
        str = scanner.nextLine();
        searchAscendingString(str);
    }

    public static String searchAscendingString(String str) {
        String newString = "";
        int firstCharacter = str.charAt(0);
        int character;
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            if (character >= firstCharacter) {
                firstCharacter = character;
                newString += str.charAt(i);
            }
        }
        System.out.println(newString);
        return newString;
    }
}
