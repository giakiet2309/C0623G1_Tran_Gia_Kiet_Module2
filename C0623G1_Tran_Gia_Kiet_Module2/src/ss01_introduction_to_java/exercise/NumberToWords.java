package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0 đến 999: ");
        int number = scanner.nextInt();

        if (number > 999) {
            System.out.println("out of ability");
        } else {
            String result = convertNumberToWord(number);
            System.out.println("number : " + result);
        }

        scanner.close();
    }

    public static String convertNumberToWord(int numbers) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven ", "twelve", "thirteen", "fourteen", "fifteen", "sixteen ", " seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", " eighty", "ninety "};

        if (numbers == 0) {
            return "zero";
        }

        String words = "";
        if ((numbers / 100) > 0) {
            words += units[numbers / 100] + " hundred ";
            numbers %= 100;
        }

        if (numbers > 0) {
            if (numbers <= 19) {
                words += units[numbers];
            } else {
                words += tens[numbers / 10];
                if ((numbers % 10) > 0) {
                    words += " " + units[numbers % 10];
                }
            }
        }

        return words;
    }
}