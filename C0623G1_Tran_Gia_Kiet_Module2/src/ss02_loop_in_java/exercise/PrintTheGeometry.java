package ss02_loop_in_java.exercise;

import java.util.Scanner;

public class PrintTheGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            if (j == 6) {
                                System.out.println("*");
                            } else {
                                System.out.print("*");
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            if (j == i) {
                                System.out.println("*");
                            } else {
                                System.out.print("*");
                            }
                        }
                    }
                    System.out.println("");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            if (j == i - 1) {
                                System.out.println("*");
                            } else {
                                System.out.print("*");
                            }
                        }
                    }
                    System.out.println("");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int height = 5;
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height * 2 - 1; j++) {
                            if (j > height - (i + 2) && j < height + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);

            }
        }
    }
}