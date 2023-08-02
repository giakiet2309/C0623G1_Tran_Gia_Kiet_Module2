import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số n");
        int number = scanner.nextInt();
        String str = "";
        if (number > 999) {
            System.out.println(number + ": out of ability");
        }
        if (number < 20 && number >= 0) {
            switch (number) {
                case 0:
                    str = "zero";
                    break;
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "tree";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
                case 10:
                    str = "ten";
                    break;
                case 11:
                    str = "eleven";
                    break;
                case 12:
                    str = "twelve";
                    break;
                case 13:
                    str = "thirteen";
                    break;
                case 14:
                    str = "fourteen";
                    break;
                case 15:
                    str = "fifteen";
                    break;
                case 16:
                    str = "sixteen";
                    break;
                case 17:
                    str = "seventeen";
                    break;
                case 18:
                    str = "eighteen";
                    break;
                case 19:
                    str = "nineteen";
                    break;
            }
            System.out.println(number + ": " + str);
        }

        if (number > 20 && number < 999) {
            str = "";
            int hundreds = number / 100;
            if (hundreds > 0) {
                str += ConvertHundreds(hundreds) + " hundred and ";
            }
            int tens = (number - hundreds * 100) / 10;
            str += ConvertTens(tens) + " ";
            int ones = number % 10;
            str += ConvertHundreds(ones);
            System.out.println(number + ": " + str);
        }
    }

    public static String ConvertHundreds(int number) {
        String strhun = "";
        switch (number) {
            case 1:
                strhun = "one";
                break;
            case 2:
                strhun = "two";
                break;
            case 3:
                strhun = "three";
                break;
            case 4:
                strhun = "four";
                break;
            case 5:
                strhun = "five";
                break;
            case 6:
                strhun = "six";
                break;
            case 7:
                strhun = "seven";
                break;
            case 8:
                strhun = "eight";
                break;
            case 9:
                strhun = "nine";
                break;
        }
        return strhun;
    }

    public static String ConvertTens(int number) {
        String strten = "";
        switch (number) {
            case 2:
                strten = "twenty";
                break;
            case 3:
                strten = "thirty";
                break;
            case 4:
                strten = "forty";
                break;
            case 5:
                strten = "fifty";
                break;
            case 6:
                strten = "sixty";
                break;
            case 7:
                strten = "seventy";
                break;
            case 8:
                strten = "eighty";
                break;
            case 9:
                strten = "ninety";
                break;
        }
        return strten;
    }

}