package ss02_loop_in_java.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 100) {
            i++;
            int test = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    test++;
                }
            }
            if (test == 0) {
                count++;
                System.out.println(count + ": " + i);
            }
        }
    }
}
