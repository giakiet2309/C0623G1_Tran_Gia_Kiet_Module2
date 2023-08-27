package CaseStudy.controller;

import java.util.Scanner;

public class CustomerController {
    public static void showMenuCustomer() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Customer Manager======");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
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