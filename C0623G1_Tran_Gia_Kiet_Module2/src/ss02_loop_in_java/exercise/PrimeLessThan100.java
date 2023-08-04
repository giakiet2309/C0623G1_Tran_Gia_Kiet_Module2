package ss02_loop_in_java.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        while (number < 100) {
            number++;
            int test = 0;
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    test++;
                }
            }
            if (test == 0) {
                count++;
                System.out.println(count + ": " + number);
            }
        }
    }
}
