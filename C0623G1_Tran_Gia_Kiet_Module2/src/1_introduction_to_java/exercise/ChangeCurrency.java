import java.util.Scanner;
public class ChangeCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Mời bạn nhập vao lượng USD cần chuyển đổi");
        double usd = scanner.nextDouble();
        double vnd = rate * usd;
        System.out.println("Giá trị chuyển đổi là: " + vnd);
    }
}