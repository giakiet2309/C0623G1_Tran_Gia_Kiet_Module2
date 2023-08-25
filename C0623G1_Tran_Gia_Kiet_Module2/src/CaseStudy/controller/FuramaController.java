package CaseStudy.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Furama Manager======");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Choose number");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls ! ");
            }
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }
}
