package CaseStudy.controller;

import java.util.Scanner;

public class EmployeeController {

    public static void showMenuEmployee() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Employee Manager======");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.println("Choose number : ");
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
                    break;
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }
}
