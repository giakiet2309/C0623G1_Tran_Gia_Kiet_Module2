package ss04_class_and_obj_in_java.exercise.QuadraticEquationn;

import java.util.Scanner;

public class Bt1_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A x^2 + B x + C = 0");
        System.out.print("Nhập vào biến A : ");
        double a = Double.parseDouble(scanner.next());
        System.out.print("Nhập vào biến B : ");
        double b = Double.parseDouble(scanner.next());
        System.out.print("Nhập vào biến C : ");
        double c = Double.parseDouble(scanner.next());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.getResult());

    }
}
